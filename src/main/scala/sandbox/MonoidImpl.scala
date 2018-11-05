object MonoidImpl {
  // The typeclass

  trait Monoid[A] {
    def combine(x: A, y: A): A
    def empty: A
  }

  // Instances of the typeclass

  // Task: Define instances for Int and Option

  // Syntax for using the typeclass
  def add[A](x: A, y: A)(implicit monoid: Monoid[A]): A =
    monoid.combine(x, y)

  // Example use cases

  // println(add(1, 2))
  // println(add(Some(1), None))
}
