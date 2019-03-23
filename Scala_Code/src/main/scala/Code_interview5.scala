/**
  * Created by User on 2/17/2019.
  */

//https://alvinalexander.com/scala/scala-string-examples-collection-cheat-sheet
object Code_interview5 {

  def main(args : Array[String]):Unit = {
    val hello = "Hello"

    hello(0)                    // "H"
    hello(1)                    // "e"
    hello.length                // 5
    hello.foreach(print)        // Hello
    println(hello.drop(2)   )            // llo
    println(hello.take(2) )              // He
    hello.take(2).toLowerCase   // he

    println(hello.sortWith(_ < _))
  }

}
