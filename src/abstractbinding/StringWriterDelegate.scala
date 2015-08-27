package abstractbinding

import java.io.StringWriter

/**
 * Created by huang_xw on 2015/08/20.
 */
class StringWriterDelegate extends Writer {
  val writer = new StringWriter()

  def writeMessage(message: String) = writer.write(message)

  override  def toString():String=writer.toString
}
