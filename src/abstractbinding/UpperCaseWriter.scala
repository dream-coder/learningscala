package abstractbinding

/**
 * Created by huang_xw on 2015/08/20.
 */
trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String) = super.writeMessage(message.toUpperCase)
}
