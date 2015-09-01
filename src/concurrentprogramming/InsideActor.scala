package concurrentprogramming

import akka.actor.Actor
import akka.event.Logging

/**
 * Created by jack on 15/9/1.
 */
class InsideActor extends Actor {
  val log= Logging(context.system,this)
  def receive={
    case "hello" => log.info ("inside : world")
    case "good" => println("inside: morning")
  }
}
