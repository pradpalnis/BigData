/**
  * Created by User on 2/17/2019.
  */
object Anonymous_object {

  def main(args : Array[String]) ={
    new Anonymous_class().display() // no reference created i.e.,Anonymous , no re use

    val v = (x: Int) => x * x * x
    val k = v(5)
    println("^^^^^^^^^^^^^^^")
    println(k)
    println(v(8))
  }

}
