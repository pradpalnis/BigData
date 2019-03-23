/**
  * Created by User on 2/16/2019.
  */
object Functions {
  def main(args : Array[String]) = {

    if(args.length < 2){
      print("Not enough args passed")
    }
    else{
      println("String returned : " + function_c(Integer.parseInt(args(0)),args(1)))
    }


  }

  def function_c(a : Int, b: String): String = {
    return b
  }

}
