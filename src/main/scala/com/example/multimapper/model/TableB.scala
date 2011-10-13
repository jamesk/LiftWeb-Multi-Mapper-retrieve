package com.example.multimapper.model

import _root_.net.liftweb.mapper._
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._

import java.util.Date

object TableB extends TableB with LongKeyedMetaMapper[TableB] 
{

}

class TableB extends LongKeyedMapper[TableB] with IdPK
{
	def getSingleton = TableB
	
	object aID extends MappedLongForeignKey(this, TableA)
	
	object desc extends MappedString(this, 255)
	{
		override def defaultValue = "This is from table b"
	}
	
	object bField extends MappedBoolean(this)
	{
		
	}
	
	object creationTime extends MappedDateTime(this)
	{
		override def defaultValue = new Date()
	}
}