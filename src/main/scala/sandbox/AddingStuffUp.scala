package sandbox

import cats.implicits._

object AddingStuffUp extends App {
  val numbers = List(1, 2, 3)
  val strings = List("1", "2", "3")
  val options = List(Some(1), None, Some(2), None, Some(3))
  val pairs = numbers.zip(strings)

  // Task: Add up the items in each of these lists!
}
