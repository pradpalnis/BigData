/**
  * Created by User on 2/17/2019.
  */
object Closure {

  def main(args :Array[String]) = {

    var v = 3
    val mul =(i:Int) => i* v

    println(mul(5))

    val mul1 =(i:Int,j:Int) => i* v +j *v

    println(mul1(5,5))


  }

}
