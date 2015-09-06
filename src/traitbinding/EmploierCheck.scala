package traitbinding

/**
 * Created by huang_xw on 2015/08/20.
 */
trait EmploierCheck extends Check {
  override def check(name: String) = {

    println("check " + name)
    name
  }
}
