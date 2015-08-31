package concurrentprogramming

import scala.actors.Actor._

/**
 * Created by huang_xw on 2015/08/28.
 */
class FasterPerfectNumberFinder {
  def sumOfFactorsInRange(lower: Int, upper: Int, number: Int) = {
    (0 /: (lower to upper)) { (sum, i) => if (number % i == 0) sum + i else sum }
  }

  def isPerfectConcurrent(candidate: Int) = {
    val RANGE = 1000000
    val numberOfPartitions = (candidate.toDouble / RANGE).ceil.toInt
    val caller = self
    for (i <- 0 to numberOfPartitions) {
      val lower = i * RANGE + 1
      val upper = (i + 1) * RANGE
      actor {
        caller ! sumOfFactorsInRange(lower, upper, candidate)
      }
    }
    val sum = (0 /: (0 until numberOfPartitions)) { (partitionSum, i) =>
      receive {
        case sumInRange: Int => partitionSum + sumInRange
      }
    }
    2 * candidate == sum
  }
}
