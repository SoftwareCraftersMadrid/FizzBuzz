import org.scalatest.FlatSpec
import org.scalatest.Matchers

class FizzBuzzSpec extends FlatSpec with Matchers {

  def module(i: Int, d: Int): Boolean = i % d == 0

  def FizzBuzz(input:String)={
    input.toInt match{
      case x if module(x, 15) => "fizzbuzz"
      case x if module(x, 3) => "fizz"
      case x if module(x, 5) => "buzz"
      case _ => input
    }
  }

  "FizzBuzz" should "return 1 if input is 1" in {
    FizzBuzz("1") should be("1")
  }
  it should "return 2 if input is 2" in {
    FizzBuzz("2") should be("2")
  }
  it should "return fizz if input is 3" in {
    FizzBuzz("3") should be("fizz")
  }
  it should "return fizz if input is 4" in {
    FizzBuzz("4") should be("4")
  }
  it should "return buzz if input is 5" in {
    FizzBuzz("5") should be("buzz")
  }
  it should "return fizzbuzz if input is 15" in {
    FizzBuzz("15") should be("fizzbuzz")
  }
}
