/**
  * Created by User on 2/17/2019.
  */
object Pattern_match {
  def main(args: Array[String]) {
    val x = Pattern_match(5)
    println(x)

    x match {
      case Pattern_match(num) => println(x+" is bigger two times than "+num)
      //unapply is invoked
      case _ => println("i cannot calculate")
    }
  }
  def apply(x: Int) = x*2
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None

}
