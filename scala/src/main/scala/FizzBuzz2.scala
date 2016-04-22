/**
 * Created by arincon on 4/03/15.
 */
object FizzBuzz2 {
  def getResult(number: Int): String = (number % 3, number % 5) match {
    case (0 , 0) => "fizzbuzz"
    case (0 , _) => "fizz"
    case (_ , 0) => "buzz"
    case _ => number.toString()
  }
}
