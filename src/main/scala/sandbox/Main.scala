package sandbox

object Main {
  def greeting(name: String): String =
    println("Hello " + name + "!")
  
  def main(args: Array[String]): Unit =
    println(greeting("world"))
}
