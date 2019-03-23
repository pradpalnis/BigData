/**
  * Created by User on 2/17/2019.
  */
object InstanceOf {

  def main(args: Array[String]) = {
    var s ="String"
    var i = 1

    println(s.asInstanceOf[String])
    println(i.asInstanceOf[Int])


    println(s.isInstanceOf[String])
    println(i.isInstanceOf[Int])
  }

}
