package concurrentprogramming

import akka.actor.Actor
import akka.event.Logging

/**
 * Created by jack on 2015/8/31.
 */
class HelloActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case "hello" => log.info("world")
    case _ => log.info("uhu")
  }
}
