package models

import play.api.libs.json.{Format, Json}

case class Person(name: String, luckyNumber: Int)

object Person {
  implicit val fmt: Format[Person] = Json.format[Person]
}
