package sandbox

import cats.data.State
import cats.implicits._

sealed abstract class Node
final case class Ol(children: List[Node]) extends Node
final case class Li(children: List[Node]) extends Node
final case class Text(text: String) extends Node

object Node {
  def ol(children: Node*): Node =
    Ol(children.toList)

  def li(children: Node*): Node =
    Li(children.toList)

  def tx(text: String): Node =
    Text(text)
}

trait TestData {
  import Node._

  val doc1 = ol(
    li(tx("List item")),
    li(tx("List item")),
    li(tx("List item"))
  )

  val doc2 = ol(
    li(
      tx("List item"),
      ol(
        li(tx("Sublist item")),
        li(tx("Sublist item"))
      )
    ),
    li(
      tx("List item"),
      ol(
        li(tx("Sublist item")),
        li(tx("Sublist item"))
      )
    ),
    li(
      tx("List item"),
      ol(
        li(tx("Sublist item")),
        li(tx("Sublist item"))
      )
    )
  )
}

object StateMonad extends App with TestData {
  // Task: Render a set of nested lists to a string. Number the items correctly!
}
