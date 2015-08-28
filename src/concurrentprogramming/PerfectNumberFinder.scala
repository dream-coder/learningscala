package concurrentprogramming

/**
 * Created by huang_xw on 2015/08/28.
 */
class PerfectNumberFinder {
  def sumOfFactors(number: Int): Unit = {
    (0 /: (1 to number)) { (sum, i) => if (number % i == 0) sum + i else sum }
  }

  sumOfFactors(6)
}
