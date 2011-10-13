package com.example.multimapper.lib

import java.sql.ResultSet


class ScramblingResultSet(rs: ResultSet, tableName: String) extends java.sql.ResultSet
{
	def clearWarnings() { rs.clearWarnings }
	def getWarnings(): java.sql.SQLWarning = { rs.getWarnings }
	def getStatement() : java.sql.Statement = { rs.getStatement }
def moveToCurrentRow() { rs.moveToCurrentRow }
def moveToInsertRow() { rs.moveToInsertRow }
def cancelRowUpdates() { rs.cancelRowUpdates }
def refreshRow() { rs.refreshRow }
def deleteRow() { rs.deleteRow }
def updateRow() { rs.updateRow }
def insertRow() { rs.insertRow }
def rowDeleted() : Boolean = { rs.rowDeleted }
def rowInserted() : Boolean = { rs.rowInserted }
def rowUpdated() : Boolean = { rs.rowUpdated }
def getConcurrency() : Int = { rs.getConcurrency }
def getType() : Int = { rs.getType }
def getFetchSize() : Int = { rs.getFetchSize }
def getFetchDirection() : Int = { rs.getFetchDirection }
def previous() : Boolean = { rs.previous }
def getRow() : Int = { rs.getRow }
def last() : Boolean = { rs.last }
def first() : Boolean = { rs.first }
def afterLast() { rs.afterLast }
def beforeFirst() { rs.beforeFirst }
def isLast() : Boolean = { rs.isLast }
def isFirst() : Boolean = { rs.isFirst }
def isAfterLast() : Boolean = { rs.isAfterLast }
def isBeforeFirst() : Boolean = { rs.isBeforeFirst }
def getMetaData() : java.sql.ResultSetMetaData = { new ScramblingResultSetMetaData(rs.getMetaData, tableName) }
def getCursorName() : java.lang.String = { rs.getCursorName }
def wasNull() : Boolean = { rs.wasNull }
def close() { rs.close }
def next() : Boolean = { rs.next }
def isClosed() : Boolean = { rs.isClosed }
def getHoldability() : Int = { rs.getHoldability }

def getNCharacterStream(x1: java.lang.String) : java.io.Reader = { rs.getNCharacterStream(x1) }
def getNCharacterStream(x1: Int) : java.io.Reader = { rs.getNCharacterStream(x1) }
def getNString(x1: java.lang.String) : java.lang.String = { rs.getNString(x1) }
def getNString(x1: Int) : java.lang.String = { rs.getNString(x1) }
def getSQLXML(x1: java.lang.String) : java.sql.SQLXML = { rs.getSQLXML(x1) }
def getSQLXML(x1: Int) : java.sql.SQLXML = { rs.getSQLXML(x1) }
def getNClob(x1: java.lang.String) : java.sql.NClob = { rs.getNClob(x1) }
def getNClob(x1: Int) : java.sql.NClob = { rs.getNClob(x1) }
def getRowId(x1: java.lang.String) : java.sql.RowId = { rs.getRowId(x1) }
def getRowId(x1: Int) : java.sql.RowId = { rs.getRowId(x1) }
def getURL(x1: java.lang.String) : java.net.URL = { rs.getURL(x1) }
def getURL(x1: Int) : java.net.URL = { rs.getURL(x1) }
def getArray(x1: java.lang.String) : java.sql.Array = { rs.getArray(x1) }
def getClob(x1: java.lang.String) : java.sql.Clob = { rs.getClob(x1) }
def getBlob(x1: java.lang.String) : java.sql.Blob = { rs.getBlob(x1) }
def getRef(x1: java.lang.String) : java.sql.Ref = { rs.getRef(x1) }
def getArray(x1: Int) : java.sql.Array = { rs.getArray(x1) }
def getClob(x1: Int) : java.sql.Clob = { rs.getClob(x1) }
def getBlob(x1: Int) : java.sql.Blob = { rs.getBlob(x1) }
def getRef(x1: Int) : java.sql.Ref = { rs.getRef(x1) }
def getBigDecimal(x1: java.lang.String) : java.math.BigDecimal = { rs.getBigDecimal(x1) }
def getBigDecimal(x1: Int) : java.math.BigDecimal = { rs.getBigDecimal(x1) }
def getCharacterStream(x1: java.lang.String) : java.io.Reader = { rs.getCharacterStream(x1) }
def getCharacterStream(x1: Int) : java.io.Reader = { rs.getCharacterStream(x1) }
def findColumn(x1: java.lang.String) : Int = { rs.findColumn(x1) }
def getObject(x1: java.lang.String) : java.lang.Object = { rs.getObject(x1) }
def getObject(x1: Int) : java.lang.Object = { rs.getObject(x1) }
def updateNull(x1: Int) { rs.updateNull(x1) }
def setFetchSize(x1: Int) { rs.setFetchSize(x1) }
def setFetchDirection(x1: Int) { rs.setFetchDirection(x1) }
def relative(x1: Int) : Boolean = { rs.relative(x1) }
def absolute(x1: Int) : Boolean = { rs.absolute(x1) }
def getBinaryStream(x1: java.lang.String) : java.io.InputStream = { rs.getBinaryStream(x1) }
def getUnicodeStream(x1: java.lang.String) : java.io.InputStream = { rs.getUnicodeStream(x1) }
def getAsciiStream(x1: java.lang.String) : java.io.InputStream = { rs.getAsciiStream(x1) }
def getTimestamp(x1: java.lang.String) : java.sql.Timestamp = { rs.getTimestamp(x1) }
def getTime(x1: java.lang.String) : java.sql.Time = { rs.getTime(x1) }
def getDate(x1: java.lang.String) : java.sql.Date = { rs.getDate(x1) }
def getBytes(x1: java.lang.String) : Array[Byte] = { rs.getBytes(x1) }
def getDouble(x1: java.lang.String) : Double = { rs.getDouble(x1) }
def getFloat(x1: java.lang.String) : Float = { rs.getFloat(x1) }
def getLong(x1: java.lang.String) : Long = { rs.getLong(x1) }
def getInt(x1: java.lang.String) : Int = { rs.getInt(x1) }
def getShort(x1: java.lang.String) : Short = { rs.getShort(x1) }
def getByte(x1: java.lang.String) : Byte = { rs.getByte(x1) }
def getBoolean(x1: java.lang.String) : Boolean = { rs.getBoolean(x1) }
def getString(x1: java.lang.String) : java.lang.String = { rs.getString(x1) }
def getBinaryStream(x1: Int) : java.io.InputStream = { rs.getBinaryStream(x1) }
def getUnicodeStream(x1: Int) : java.io.InputStream = { rs.getUnicodeStream(x1) }
def getAsciiStream(x1: Int) : java.io.InputStream = { rs.getAsciiStream(x1) }
def getTimestamp(x1: Int) : java.sql.Timestamp = { rs.getTimestamp(x1) }
def getTime(x1: Int) : java.sql.Time = { rs.getTime(x1) }
def getDate(x1: Int) : java.sql.Date = { rs.getDate(x1) }
def getBytes(x1: Int) : Array[Byte] = { rs.getBytes(x1) }
def getDouble(x1: Int) : Double = { rs.getDouble(x1) }
def getFloat(x1: Int) : Float = { rs.getFloat(x1) }
def getLong(x1: Int) : Long = { rs.getLong(x1) }
def getInt(x1: Int) : Int = { rs.getInt(x1) }
def getShort(x1: Int) : Short = { rs.getShort(x1) }
def getByte(x1: Int) : Byte = { rs.getByte(x1) }
def getBoolean(x1: Int) : Boolean = { rs.getBoolean(x1) }
def getString(x1: Int) : java.lang.String = { rs.getString(x1) }
def isWrapperFor(x1: java.lang.Class[_]) : Boolean = { rs.isWrapperFor(x1) }
def unwrap[T](x1: java.lang.Class[T]) : T = { rs.unwrap[T](x1) }
def updateNull(x1: java.lang.String) { rs.updateNull(x1) }

def updateNClob(x1: java.lang.String,x2: java.io.Reader) { rs.updateNClob(x1, x2) }
def updateNClob(x1: Int,x2: java.io.Reader) { rs.updateNClob(x1, x2) }
def updateClob(x1: java.lang.String,x2: java.io.Reader) { rs.updateClob(x1, x2) }
def updateClob(x1: Int,x2: java.io.Reader) { rs.updateClob(x1, x2) }
def updateBlob(x1: java.lang.String,x2: java.io.InputStream) { rs.updateBlob(x1, x2) }
def updateBlob(x1: Int,x2: java.io.InputStream) { rs.updateBlob(x1, x2) }
def updateCharacterStream(x1: java.lang.String,x2: java.io.Reader) { rs.updateCharacterStream(x1, x2) }
def updateBinaryStream(x1: java.lang.String,x2: java.io.InputStream) { rs.updateBinaryStream(x1, x2) }
def updateAsciiStream(x1: java.lang.String,x2: java.io.InputStream) { rs.updateAsciiStream(x1, x2) }
def updateCharacterStream(x1: Int,x2: java.io.Reader) { rs.updateCharacterStream(x1, x2) }
def updateBinaryStream(x1: Int,x2: java.io.InputStream) { rs.updateBinaryStream(x1, x2) }
def updateAsciiStream(x1: Int,x2: java.io.InputStream) { rs.updateAsciiStream(x1, x2) }
def updateNCharacterStream(x1: java.lang.String,x2: java.io.Reader) { rs.updateNCharacterStream(x1, x2) }
def updateNCharacterStream(x1: Int,x2: java.io.Reader) { rs.updateNCharacterStream(x1, x2) }
def updateSQLXML(x1: java.lang.String,x2: java.sql.SQLXML) { rs.updateSQLXML(x1, x2) }
def updateSQLXML(x1: Int,x2: java.sql.SQLXML) { rs.updateSQLXML(x1, x2) }
def updateNClob(x1: java.lang.String,x2: java.sql.NClob) { rs.updateNClob(x1, x2) }
def updateNClob(x1: Int,x2: java.sql.NClob) { rs.updateNClob(x1, x2) }
def updateNString(x1: java.lang.String,x2: java.lang.String) { rs.updateNString(x1, x2) }
def updateNString(x1: Int,x2: java.lang.String) { rs.updateNString(x1, x2) }
def updateRowId(x1: java.lang.String,x2: java.sql.RowId) { rs.updateRowId(x1, x2) }
def updateRowId(x1: Int,x2: java.sql.RowId) { rs.updateRowId(x1, x2) }
def updateArray(x1: java.lang.String,x2: java.sql.Array) { rs.updateArray(x1, x2) }
def updateArray(x1: Int,x2: java.sql.Array) { rs.updateArray(x1, x2) }
def updateClob(x1: java.lang.String,x2: java.sql.Clob) { rs.updateClob(x1, x2) }
def updateClob(x1: Int,x2: java.sql.Clob) { rs.updateClob(x1, x2) }
def updateBlob(x1: java.lang.String,x2: java.sql.Blob) { rs.updateBlob(x1, x2) }
def updateBlob(x1: Int,x2: java.sql.Blob) { rs.updateBlob(x1, x2) }
def updateRef(x1: java.lang.String,x2: java.sql.Ref) { rs.updateRef(x1, x2) }
def updateRef(x1: Int,x2: java.sql.Ref) { rs.updateRef(x1, x2) }
def getTimestamp(x1: java.lang.String,x2: java.util.Calendar) : java.sql.Timestamp = { rs.getTimestamp(x1, x2) }
def getTimestamp(x1: Int,x2: java.util.Calendar) : java.sql.Timestamp = { rs.getTimestamp(x1, x2) }
def getTime(x1: java.lang.String,x2: java.util.Calendar) : java.sql.Time = { rs.getTime(x1, x2) }
def getTime(x1: Int,x2: java.util.Calendar) : java.sql.Time = { rs.getTime(x1, x2) }
def getDate(x1: java.lang.String,x2: java.util.Calendar) : java.sql.Date = { rs.getDate(x1, x2) }
def getDate(x1: Int,x2: java.util.Calendar) : java.sql.Date = { rs.getDate(x1, x2) }
def getObject(x1: java.lang.String,x2: java.util.Map[java.lang.String,java.lang.Class[_]]) : java.lang.Object = { rs.getObject(x1, x2) }
def getObject(x1: Int,x2: java.util.Map[java.lang.String,java.lang.Class[_]]) : java.lang.Object = { rs.getObject(x1, x2) }
def updateObject(x1: java.lang.String,x2: Any) { rs.updateObject(x1, x2) }
def updateTimestamp(x1: java.lang.String,x2: java.sql.Timestamp) { rs.updateTimestamp(x1, x2) }
def updateTime(x1: java.lang.String,x2: java.sql.Time) { rs.updateTime(x1, x2) }
def updateDate(x1: java.lang.String,x2: java.sql.Date) { rs.updateDate(x1, x2) }
def updateBytes(x1: java.lang.String,x2: Array[Byte]) { rs.updateBytes(x1, x2) }
def updateString(x1: java.lang.String,x2: java.lang.String) { rs.updateString(x1, x2) }
def updateBigDecimal(x1: java.lang.String,x2: java.math.BigDecimal) { rs.updateBigDecimal(x1, x2) }
def updateDouble(x1: java.lang.String,x2: Double) { rs.updateDouble(x1, x2) }
def updateFloat(x1: java.lang.String,x2: Float) { rs.updateFloat(x1, x2) }
def updateLong(x1: java.lang.String,x2: Long) { rs.updateLong(x1, x2) }
def updateInt(x1: java.lang.String,x2: Int) { rs.updateInt(x1, x2) }
def updateShort(x1: java.lang.String,x2: Short) { rs.updateShort(x1, x2) }
def updateByte(x1: java.lang.String,x2: Byte) { rs.updateByte(x1, x2) }
def updateBoolean(x1: java.lang.String,x2: Boolean) { rs.updateBoolean(x1, x2) }
def updateObject(x1: Int,x2: Any) { rs.updateObject(x1, x2) }
def updateTimestamp(x1: Int,x2: java.sql.Timestamp) { rs.updateTimestamp(x1, x2) }
def updateTime(x1: Int,x2: java.sql.Time) { rs.updateTime(x1, x2) }
def updateDate(x1: Int,x2: java.sql.Date) { rs.updateDate(x1, x2) }
def updateBytes(x1: Int,x2: Array[Byte]) { rs.updateBytes(x1, x2) }
def updateString(x1: Int,x2: java.lang.String) { rs.updateString(x1, x2) }
def updateBigDecimal(x1: Int,x2: java.math.BigDecimal) { rs.updateBigDecimal(x1, x2) }
def updateDouble(x1: Int,x2: Double) { rs.updateDouble(x1, x2) }
def updateFloat(x1: Int,x2: Float) { rs.updateFloat(x1, x2) }
def updateLong(x1: Int,x2: Long) { rs.updateLong(x1, x2) }
def updateInt(x1: Int,x2: Int) { rs.updateInt(x1, x2) }
def updateShort(x1: Int,x2: Short) { rs.updateShort(x1, x2) }
def updateByte(x1: Int,x2: Byte) { rs.updateByte(x1, x2) }
def updateBoolean(x1: Int,x2: Boolean) { rs.updateBoolean(x1, x2) }
def getBigDecimal(x1: java.lang.String,x2: Int) : java.math.BigDecimal = { rs.getBigDecimal(x1, x2) }
def getBigDecimal(x1: Int,x2: Int) : java.math.BigDecimal = { rs.getBigDecimal(x1, x2) }



def updateNClob(x1: java.lang.String,x2: java.io.Reader,x3: Long) { rs.updateNClob(x1, x2, x3) }
def updateNClob(x1: Int,x2: java.io.Reader,x3: Long) { rs.updateNClob(x1, x2, x3) }
def updateClob(x1: java.lang.String,x2: java.io.Reader,x3: Long) { rs.updateClob(x1, x2, x3) }
def updateClob(x1: Int,x2: java.io.Reader,x3: Long) { rs.updateClob(x1, x2, x3) }
def updateBlob(x1: java.lang.String,x2: java.io.InputStream,x3: Long) { rs.updateBlob(x1, x2, x3) }
def updateBlob(x1: Int,x2: java.io.InputStream,x3: Long) { rs.updateBlob(x1, x2, x3) }
def updateCharacterStream(x1: java.lang.String,x2: java.io.Reader,x3: Long) { rs.updateCharacterStream(x1, x2, x3) }
def updateBinaryStream(x1: java.lang.String,x2: java.io.InputStream,x3: Long) { rs.updateBinaryStream(x1, x2, x3) }
def updateAsciiStream(x1: java.lang.String,x2: java.io.InputStream,x3: Long) { rs.updateAsciiStream(x1, x2, x3) }
def updateCharacterStream(x1: Int,x2: java.io.Reader,x3: Long) { rs.updateCharacterStream(x1, x2, x3) }
def updateBinaryStream(x1: Int,x2: java.io.InputStream,x3: Long) { rs.updateBinaryStream(x1, x2, x3) }
def updateAsciiStream(x1: Int,x2: java.io.InputStream,x3: Long) { rs.updateAsciiStream(x1, x2, x3) }
def updateNCharacterStream(x1: java.lang.String,x2: java.io.Reader,x3: Long) { rs.updateNCharacterStream(x1, x2, x3) }
def updateNCharacterStream(x1: Int,x2: java.io.Reader,x3: Long) { rs.updateNCharacterStream(x1, x2, x3) }
def updateObject(x1: java.lang.String,x2: Any,x3: Int) { rs.updateObject(x1, x2, x3) }
def updateCharacterStream(x1: java.lang.String,x2: java.io.Reader,x3: Int) { rs.updateCharacterStream(x1, x2, x3) }
def updateBinaryStream(x1: java.lang.String,x2: java.io.InputStream,x3: Int) { rs.updateBinaryStream(x1, x2, x3) }
def updateAsciiStream(x1: java.lang.String,x2: java.io.InputStream,x3: Int) { rs.updateAsciiStream(x1, x2, x3) }
def updateObject(x1: Int,x2: Any,x3: Int) { rs.updateObject(x1, x2, x3) }
def updateCharacterStream(x1: Int,x2: java.io.Reader,x3: Int) { rs.updateCharacterStream(x1, x2, x3) }
def updateBinaryStream(x1: Int,x2: java.io.InputStream,x3: Int) { rs.updateBinaryStream(x1, x2, x3) }
def updateAsciiStream(x1: Int,x2: java.io.InputStream,x3: Int) { rs.updateAsciiStream(x1, x2, x3) }



}