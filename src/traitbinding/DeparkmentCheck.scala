package traitbinding

/**
 * Created by huang_xw on 2015/08/20.
 */
trait DeparkmentCheck extends Check {
  override def check(name: String) = "department check " + name + "!" + super.check(name)
}
