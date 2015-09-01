package traitbinding


import akka.actor.{Props, ActorSystem}
import concurrentprogramming.HelloActor

/**
 * Created by huang_xw on 2015/08/20.
 */
object app {
  def main(args: Array[String]) {
    //    val check = new Check with DeparkmentCheck with EmploierCheck
    //    println(check check("huangxw"))

    //    val myWriterProfanityFirst = new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter
    //    val myWriterProfanityLast = new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter
    //    myWriterProfanityFirst writeMessage ("u are stupid")
    //    myWriterProfanityLast writeMessage ("u are stupid")
    //    println(myWriterProfanityFirst.toString())
    //    println(myWriterProfanityLast.toString())
    //隐士转换和伴生对象
    //    println(2 days ago)
    //    println(2 days from_now)
    //模式匹配
    //new PatternMatching
    //new TradeProcessor
    //对象匹配
    //    val acceptor = new ThingsAcceptor
    //    acceptor.acceptStuff(Apple())
    //    acceptor.acceptStuff(Orange())
    //    acceptor.acceptStuff(Apple)
    //    acceptor.acceptStuff(new Apple)
    //提取器匹配
    //    StockService.process("error:1234")
    //    StockService.process("GOOG:1234")
    //正则表达式提取器
    //new RegularExpr
    //new MatchUsingRegex
    //并发编程
    //    val pn = new PerfectNumberFinder
    //    pn.isPerfect(12)
    //        val fpn = new FasterPerfectNumberFinder
    //        (33550336 to 33550663).foreach((a: Int) => println(fpn.isPerfectConcurrent(a)))
    val actorsystem = ActorSystem("mySystem")
    val helloActor = actorsystem.actorOf(Props[HelloActor], "helloActor")
    helloActor ! "ggg"
  }
}

