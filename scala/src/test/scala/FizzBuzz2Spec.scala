import org.scalatest.FlatSpec
import org.scalatest.Matchers

class FizzBuzz2Spec extends FlatSpec with Matchers {

  val dictionary: Map[Int, String] = Map(3 -> "fizz", 5 -> "buzz", 7 -> "wizz")

  def processor(i: Int) = {
    lazy val toReturn = dictionary.keys.flatMap(module(i, _))
    if (toReturn.isEmpty) i
    else toReturn.mkString("")
  }

  private def module(i: Int, divisor: Int): Option[String] = {
    if (i % divisor == 0) dictionary.get(divisor) else None
  }

  "processor" should "return 1 if input is 1" in {
    processor(1) should be(1)
  }
  it should "return fizz if input is 6" in {
    processor(6) should be("fizz")
  }
  it should "return buzz if input is 10" in {
    processor(10) should be("buzz")
  }
  it should "return fizzbuzz if input is 15" in {
    processor(15) should be("fizzbuzz")
  }
  it should "return wizz if input is 7" in {
    processor(7) should be("wizz")
  }
}
