/**
  * Created by User on 2/15/2019.
  */
object ForLoop {
  def main(args : Array[String]) : Unit ={

    for( i <- 0 to 5)
      {
        println(i)
      }
      println("-----------------")
    for( i <- 0  until 5)
    {
      println(i)
    }
    println("****************")

    var str = "apple"
    for( i <- 0 to str.length())
      {
        println(str)
      }

    println("****************")

    for ( j <- 0 to 3; k <- 0 to 5){
      println(j +" "+ k)

    }

    println("^^^^^^^^^^^^^^^^^")
    var ranklist : List[Int] = List(1,2,3,4,5,6,7,8,9,10)

    // For loop with filters
    for( rank <- ranklist if rank < 7; if rank > 2 )
    {
      println("Author rank is : " +rank);
    }


    println("%%%%%%%%%%%%%%%%")
    var k_rank = for( rank <- ranklist if rank > 5) yield rank
    for(r <- k_rank){
      println(r)
    }
  }

}
