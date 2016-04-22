/**
 * Created by arincon on 4/03/15.
 */
object FizzBuzz {
  def getResult(i: Int): String ={
    var  t=""
    if (i%3==0)  t += "fizz"
    if (i%5==0) t.+=("buzz")
    if (t=="") t=i.toString
    t
  }

}
