package sandbox

object Main {
  def greeting(name: String): String =
    "Hello " + name + "!"

  def main(args: Array[String]): Unit =
    println(greeting("world"))
}
