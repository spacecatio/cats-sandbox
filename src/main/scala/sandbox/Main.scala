package sandbox

def greeting(name: String): String =
  "Hello " + name + "!"

@main def main(): Unit =
  println(greeting("world"))
