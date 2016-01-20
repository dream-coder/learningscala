import org.scalatest._

/**
 * Created by huang_xw on 2015/9/25.
 */
class test01 extends FunSuite with BeforeAndAfterAll {
  override def beforeAll(): Unit = {
     println("before all!")
  }

  override  def afterAll():Unit={
    println("after all!")
  }

  test("just a simple test"){
    assert(1==1)
  }

}
