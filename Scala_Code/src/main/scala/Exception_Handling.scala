/**
  * Created by User on 2/17/2019.
  */
object Exception_Handling {

  def main(args:Array[String]) ={

    try{
    val r = 5/0
    }
    catch {
      case ex: Exception => {
        println("Exception captured")
      }
    }
    finally{
      println("finally block")
    }

  }

}
