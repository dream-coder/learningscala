package patternmatching

import scala.actors._
import Actor._

/**
 * Created by huang_xw on 2015/08/26.
 */

case class Apple()

case class Orange()

case class Book()

class ThingsAcceptor {
  def acceptStuff(thing: Any): Unit = {
    thing match {
      case Apple() => println("Thanks  for the Apple!")
      case Orange() => println("Thanks for the Orange!")
      case Book() => println("Thanks for the Book!")
      case _ => println("Excuse me,why did you send me a " + thing)
    }

  }
}
