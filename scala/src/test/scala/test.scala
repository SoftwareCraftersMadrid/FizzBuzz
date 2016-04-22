class FizzBuzzTest extends UnitSpec {

  "FizzBuzz" should "return fizz if the number is dividable by 3" in {
    FizzBuzz.getResult(3) should be("fizz")
    FizzBuzz.getResult(6) should be("fizz")
  }
  it should "return buzz if the number is dividable by 5" in {
    FizzBuzz.getResult(5) should be("buzz")
  }
  it should "return fizzbuzz if the number is dividable by 15" in {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
  }
  it should "return number if input number is not dividable by 3, 5 or 15" in {
    FizzBuzz.getResult(1) should be ("1")
  }



  "FizzBuzz2" should "return fizz if the number is dividable by 3" in {
    FizzBuzz2.getResult(3) should be("fizz")
    FizzBuzz2.getResult(6) should be("fizz")
  }
  it should "return buzz if the number is dividable by 5" in {
    FizzBuzz2.getResult(5) should be("buzz")
  }
  it should "return fizzbuzz if the number is dividable by 15" in {
    FizzBuzz2.getResult(15) should be ("fizzbuzz")
  }
  it should "return number if input number is not dividable by 3, 5 or 15" in {
    FizzBuzz2.getResult(1) should be ("1")
  }
}