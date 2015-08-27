package patternmatching

/**
 * Created by huang_xw on 2015/08/24.
 */
class PatternMatching {
  val max = 100
  val MIN = 0

  def activity(day: String) = {
    day match {
      case "Sunday" => print("Eat,sleep,repeat...")
      case "Saturday" => print("Hang out with friends...")
      case "Monday" => print("...code for fun")
      case "Friday" => print("...read a good book...")
    }
  }

  def process(input: Int) = {
    input match {
      case this.max => println("you matched max")
      case MIN => println("you matched min")
      case _ => println("unmatched")
    }
  }

  List("Monday", "Sunday", "Saturday").foreach(activity)
  List(1, 2, 3, 100, 0).foreach(process)
}
