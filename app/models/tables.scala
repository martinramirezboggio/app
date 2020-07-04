package models

import java.sql.Timestamp

import slick.jdbc.MySQLProfile.api._

import scala.reflect.ClassTag

abstract class BaseEntityTable[E: ClassTag](tag: Tag, tableName: String) extends Table[E](tag, tableName) {
  val id: Rep[String] = column[String]("ID", O.PrimaryKey)

  def createDate = column[Timestamp]("CREATE_DATE")
}
