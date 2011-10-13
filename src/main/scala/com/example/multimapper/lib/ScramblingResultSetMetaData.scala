package com.example.multimapper.lib

import java.sql.ResultSetMetaData
import _root_.net.liftweb.util.Helpers._

class ScramblingResultSetMetaData(md: ResultSetMetaData, tableName: String) extends ResultSetMetaData
{
def getColumnClassName(x1: Int): java.lang.String = { md.getColumnClassName(x1)}
def isDefinitelyWritable(x1: Int): Boolean = { md.isDefinitelyWritable(x1)}
def isWritable(x1: Int): Boolean = { md.isWritable(x1)}
def isReadOnly(x1: Int): Boolean = { md.isReadOnly(x1)}
def getColumnTypeName(x1: Int): java.lang.String = { md.getColumnTypeName(x1)}
def getColumnType(x1: Int): Int = { md.getColumnType(x1)}
def getCatalogName(x1: Int): java.lang.String = { md.getCatalogName(x1)}
def getTableName(x1: Int): java.lang.String = { md.getTableName(x1)}
def getScale(x1: Int): Int = { md.getScale(x1)}
def getPrecision(x1: Int): Int = { md.getPrecision(x1)}
def getSchemaName(x1: Int): java.lang.String = { md.getSchemaName(x1)}
def getColumnName(x1: Int): java.lang.String = 
{
	val colName = md.getColumnName(x1)
	
	if (getTableName(x1).toLowerCase == tableName)
		colName
	else
		randomString(100)
}
def getColumnLabel(x1: Int): java.lang.String = { md.getColumnLabel(x1)}
def getColumnDisplaySize(x1: Int): Int = { md.getColumnDisplaySize(x1)}
def isSigned(x1: Int): Boolean = { md.isSigned(x1)}
def isNullable(x1: Int): Int = { md.isNullable(x1)}
def isCurrency(x1: Int): Boolean = { md.isCurrency(x1)}
def isSearchable(x1: Int): Boolean = { md.isSearchable(x1)}
def isCaseSensitive(x1: Int): Boolean = { md.isCaseSensitive(x1)}
def isAutoIncrement(x1: Int): Boolean = { md.isAutoIncrement(x1)}
def getColumnCount(): Int = { md.getColumnCount}
def isWrapperFor(x1: java.lang.Class[_]): Boolean = { md.isWrapperFor(x1)}
def unwrap[T](x1: java.lang.Class[T]): T = { md.unwrap(x1)}
}