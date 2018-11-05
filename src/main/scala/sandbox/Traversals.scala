package sandbox

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

import ErrorHandling.{alice, bob, charlie, dave}

object Traversals extends App {
  def getUptime(hostname: String): Future[Int] =
    Future(hostname.length)

  val hostnames = List("alpha", "beta", "gamma", "delta")

  // Task: Traverse the list of hostnames, get the runtime of each.
  def allUptimes(hostnames: List[String]) =
    ???

  val dbResults = List(alice, bob, charlie, dave)

  // Task: Traverse the list of dbResults, parse each as type Person.
  def readAllPeople(data: List[Map[String, String]]) =
    ???
}
