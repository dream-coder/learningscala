package patternmatching

/**
 * Created by huang_xw on 2015/08/28.
 */
class MatchUsingRegex {
  def process(input: String): Unit = {
    val GoogStock = """(^[a-zA-Z]{1,}):(\d*[\d$\.]\d+)""".r
    input match {
      case GoogStock(symbol, price) => printf("price of %s is  %f \n", symbol, price.toDouble)
      case _ => println("not processing " + input)
    }
  }

  process("GOOG:310.84")
  process("GOOG:310")
  process("IBM:84.01")
  process(":84.01")
}
