package models

import java.sql.Timestamp

trait BaseEntity {
  val id: Option[String]
  val createDate: Option[Timestamp]
}

case class User(
                 id: Option[String],
                 name: String,
                 lastName: String,
                 email: String,
                 verified: Boolean,
                 password: String,
                 active: Boolean,
                 createDate: Option[Timestamp] = None
               ) extends BaseEntity
