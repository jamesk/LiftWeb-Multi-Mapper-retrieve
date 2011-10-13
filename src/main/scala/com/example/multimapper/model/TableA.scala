package com.example.multimapper.model

import _root_.net.liftweb.mapper._
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._

import java.util.Date

object TableA extends TableA with LongKeyedMetaMapper[TableA] 
{

}

class TableA extends LongKeyedMapper[TableA] with IdPK
{
	def getSingleton = TableA
	
	object desc extends MappedString(this, 255)
	{
		override def defaultValue = "This is from table a"
	}
	
	object creationTime extends MappedDateTime(this)
	{
		override def defaultValue = new Date()
	}
}