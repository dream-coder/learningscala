package patternmatching

/**
 * Created by huang_xw on 2015/08/26.
 *
 */
object StockService {
  def process(input: String): Unit = {
    input match {
      case Symbol() => println("look up price for valid symbol" + input)
      case ReceiveStockPrice(symbol@Symbol(), price) => printf("Received price %f for symbol %s\n", price, symbol)
      case _ => println("Invalid input " + input)
    }
  }
}

object ReceiveStockPrice {
  def unapply(input: String) = {
    try {
      if (input contains ":") {
        val splitQuote = input split ":"
        Some(splitQuote(0), splitQuote(1).toDouble)
      } else {
        None
      }
    } catch {
      case _: NumberFormatException => None
    }
  }
}

object Symbol {
  def unapply(symbol: String): Boolean = symbol == "GOOG" || symbol == "IBM"
}
