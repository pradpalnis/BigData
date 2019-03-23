/**
  * Created by User on 2/16/2019.
  */
object Patter_Match {
  def main(args : Array[String]) ={
    var s : String = args(0)

    s match {
      case "1" => println("1")
      case "2" => print("2")
      case _ =>print("other")

    }

    println("********************")

    var f_value  = s match {
      case "1" => 101
      case "2" => 102
      case _ => 0

    }

    println("f_value " + f_value)

  }

}
