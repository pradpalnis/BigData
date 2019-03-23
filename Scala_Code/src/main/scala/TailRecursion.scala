/**
  * Created by User on 2/17/2019.
  */
object TailRecursion {
  def main(args: Array[String]): Unit = {


    println(fact(3))
    println(factorial(5))
  }

  def fact(i:Int): Int ={
    if(i==0){
      return 1
    }else
      {
        return i * fact(i-1)
      }
  }

  def factorial(n: Int): Int = n match {
    case 0 => 1
    case _ => n * factorial(n-1)
  }

}
