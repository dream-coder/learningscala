package jvmtest

/**
 * Created by huang_xw on 2016/1/22.
 *
 */
object RunTimeConstantPoolOOM extends App {
  val list = new java.util.ArrayList[String]()
  var i: Int = 1
  while (true)
    list add {
      i += 1;
      i
    }.toString.intern()
}
