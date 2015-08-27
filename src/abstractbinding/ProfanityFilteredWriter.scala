package abstractbinding

/**
 * Created by huang_xw on 2015/08/20.
 */
trait ProfanityFilteredWriter extends Writer {
  abstract  override def writeMessage(message: String) = super.writeMessage(message.replace("stupid", "s-------"))
}
