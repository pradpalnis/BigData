/**
  * Created by User on 2/16/2019.
  */
object WhileLoop {

  def main(args : Array[String])  = {

    var list_c : List[Int] = List(1,0,2)
    var k = 0
    for(i <- list_c){
      println(i)
    }

    println("*********************")

    while( k <2){
      println(list_c(k))
      k+=1

    }
  }

}
