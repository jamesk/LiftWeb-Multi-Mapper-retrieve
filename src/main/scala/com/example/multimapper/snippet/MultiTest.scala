package com.example.multimapper {
package snippet {

import _root_.scala.xml.{NodeSeq, Text}
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._
import _root_.java.util.Date
import com.example.multimapper.lib._
import com.example.multimapper.model._
import Helpers._
import net.liftweb.mapper.Mapper
import net.liftweb.mapper.MappedField
import net.liftweb.mapper.MapperRules

class MultiTest {
  
	def sqlName[OwnerType <: Mapper[OwnerType]](m: Mapper[OwnerType]): String =
	{
		MapperRules.quoteTableName.vend(m.getSingleton._dbTableNameLC)
	}
	
	def sqlName[OwnerType <: Mapper[OwnerType]](mf: MappedField[_, OwnerType]): String =
	{
		sqlName(mf.fieldOwner) + "." + MapperRules.quoteColumnName.vend(mf._dbColumnNameLC)
	}

	def test =
	{
		val sql = "SELECT " + sqlName(TableA) + ".*, " + sqlName(TableB) +".* FROM " + 
			sqlName(TableA) +" INNER JOIN " + sqlName(TableB) + " ON " + sqlName(TableA.id) + " = " + sqlName(TableB.aID) + 
			" ORDER BY " + sqlName(TableA.creationTime)
			
		val res = MultiMapper.runQuery[TableA, TableB](sql, List(), TableA, TableB)
		
		res.flatMap(tup => 
		{
			val (a, b) = tup
			
			<tr>
				<td>{a.id.is.toString}</td>
				<td>{a.creationTime.toString}</td>
				<td>{a.desc.toString}</td>
				<td>{b.id.is.toString}</td>
				<td>{b.aID.is.toString}</td>
				<td>{b.creationTime.toString}</td>
				<td>{b.desc.toString}</td>
			</tr>
		})
	}
}

}
}
