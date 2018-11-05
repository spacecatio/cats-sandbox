package sandbox

import cats.implicits._

case class Address(houseNumber: Int, street: String)

case class Person(name: String, age: Int, address: Address)

object ErrorHandling extends App {
  val alice = Map("name" -> "Alice", "age" -> "30", "houseNumber" -> "123", "street" -> "The Drive")
  val bob = Map("name" -> "Bob", "age" -> "", "houseNumber" -> "-10", "street" -> "")
  val charlie = Map("name" -> "Charlie", "age" -> "10", "houseNumber" -> "10", "street" -> "  The Lane  ")
  val dave = Map("name" -> "Dave", "age" -> "", "houseNumber" -> "10", "street" -> "  The Lane  ")

  def parseInt(str: String): Either[String, Int] =
    scala.util.Try(str.toInt).toEither.left.map(_ => s"Invalid number: '$str'")

  // Task 1. Complete the definition of `readAddress`:
  //   - read the "houseNumber" and "street" fields from the data;
  //   - check the house number is a number;
  //   - check the house number is > 0;
  //   - check the street is non-blank.
  def readAddress(data: Map[String, String]): Either[String, Address] =
    ???

  // Task 2. Complete the definition of `readPerson`:
  //   - read the "name" and "age" fields from the data;
  //   - check the name is non-blank;
  //   - check the age is a number;
  //   - check the age is > 0.
  def readPerson(data: Map[String, String]): Either[String, Person] =
    ???

  // Task 3. Modify your code to collect *ALL* the error messages.
}
