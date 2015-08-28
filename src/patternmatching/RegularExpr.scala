package patternmatching

/**
 * Created by huang_xw on 2015/08/27.
 */
class RegularExpr {
  val pattern = """(S|s)cala""".r
  var str = "Scala is scalable and cool"
  println(pattern.findAllIn(str).mkString(","))
}
