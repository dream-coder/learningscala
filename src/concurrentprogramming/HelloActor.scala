package concurrentprogramming

import akka.actor.{Props, Actor}
import akka.event.Logging

/**
 * Created by jack on 2015/8/31.
 */
class HelloActor extends Actor {
  val log = Logging(context.system, this)
  val insideActor = context.actorOf(Props[InsideActor], name = "insideActor")

  def receive = {
    case "hello" => insideActor ! "hello"
    case "good" => insideActor ! "good"
    case msg => log.info( "outside actor process:" + msg)
  }
}
