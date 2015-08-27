package implicitTypeConversion

import java.text.SimpleDateFormat
import java.util.Calendar

/**
 * Created by huang_xw on 2015/08/20.
 */
class DateHelper(number: Int) {
  val sf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss")

  def days(when: String) = {
    val date = Calendar.getInstance()
    when match {
      case "ago" => date.add(Calendar.DAY_OF_MONTH, -number)
      case "from_now" => date.add(Calendar.DAY_OF_MONTH, number)
    }
    sf.format(date.getTime)
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"
  implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)
}
