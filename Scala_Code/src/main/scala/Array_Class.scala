/**
  * Created by User on 2/17/2019.
  */
object Array_Class {
  def main(args : Array[String]) ={
    var myArray:Array[Double] = Array(1.9,2.9,3.6,4.5,1.2,3.2,0.9)

    for( a <- myArray){
      println(a)
    }

    //Sum
    var total:Double = 0.0

    for(a <- myArray){
      total += a
    }

    println("#####################")

    println("Total " + total)

    println("#####################")

    for( i <- 0 to myArray.length -1){
      println(myArray(i))
    }


    println("$$$$$$$$$$$$$$$$$$")
    //max

    var max = 0.0

    for( a <- myArray if a > max){
      max = a
    }

    println("Max : " + max)

    println("*************************")

    var mulD_arr = Array.ofDim[Int](3,3)
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        mulD_arr(i)(j) = j;
        println((mulD_arr(i)(j)))
        }

    }


    println("^^^^^^^^^^^^^^^^")
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = Array.concat(myList1,myList2)

    for ( i <- myList3 ){
      print(i)
    }
    println("@@@@@@@@@@@@@@@@")

    var myList4 = Array.range(0,10,2)

    for ( i <- myList4 ){
      print(i)
    }




  }

}
