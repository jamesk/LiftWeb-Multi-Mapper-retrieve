package com.example.multimapper.lib

import _root_.net.liftweb.util._
import _root_.net.liftweb.common._
import net.liftweb.mapper._
import scala.collection.mutable.ListBuffer
import java.sql.PreparedStatement
import java.sql.Types

object MultiMapper 
{
	def setPreparedParams(ps : PreparedStatement, params: List[Any]): PreparedStatement = {  
		params.zipWithIndex.foreach 
		{
			case (null, idx) => ps.setNull(idx + 1, Types.VARCHAR)  
			case (i: Int, idx) => ps.setInt(idx + 1, i)  
			case (l: Long, idx) => ps.setLong(idx + 1, l)  
			case (d: Double, idx) => ps.setDouble(idx + 1, d)  
			case (f: Float, idx) => ps.setFloat(idx + 1, f)  
			case (t: _root_.java.sql.Timestamp, idx) => ps.setTimestamp(idx + 1, t)  
			case (d: _root_.java.sql.Date, idx) => ps.setDate(idx + 1, d)  
			case (t: _root_.java.sql.Time, idx) => ps.setTime(idx + 1, t)  
			case (d: _root_.java.util.Date, idx) => ps.setTimestamp(idx + 1, new _root_.java.sql.Timestamp(d.getTime))  
			case (b: Boolean, idx) => ps.setBoolean(idx + 1, b)  
			case (s: String, idx) => ps.setString(idx + 1, s)  
			case (bn: _root_.java.math.BigDecimal, idx) => ps.setBigDecimal(idx + 1, bn)  
			case (obj, idx) => ps.setObject(idx + 1, obj)  
		}  
    
		ps  
	}  	
	
	def runQuery[T1 <: Mapper[T1], T2 <: Mapper[T2]](
		sql:String, params: List[Any],
		t: T1, t2: T2, 
		dbI: ConnectionIdentifier = DefaultConnectionIdentifier
	) : List[(T1, T2)] =
	{
		val ts = t.getSingleton
		val t2s = t2.getSingleton
		
		DB.use(dbI) 
		{  
			conn =>  
			DB.prepareStatement(sql, conn) {  
				st =>
				
				val rs = setPreparedParams(st, params).executeQuery
				
				val sRS = new ScramblingResultSet(rs, ts._dbTableNameLC)
					val sRS2 = new ScramblingResultSet(rs, t2s._dbTableNameLC)
					
					var ret = new ListBuffer[T1]
					var ret2 = new ListBuffer[T2]
					val bm = ts.buildMapper(sRS)
					val bm2 = t2s.buildMapper(sRS2)
					var pos = (Full(0L) openOr 0L) * -1L  
					val max = Empty openOr _root_.java.lang.Long.MAX_VALUE  
  
					while (pos < max && rs.next()) {  
						if (pos >= 0L) 
						{  
							ret += ts.createInstance(DefaultConnectionIdentifier, rs, bm)
							ret2 += t2s.createInstance(DefaultConnectionIdentifier, rs, bm2)
						}  
						pos = pos + 1L  
					}  
  				
					ret.zip(ret2).toList
			}  
		}  
	}
}