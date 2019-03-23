/**
  * Created by User on 2/16/2019.
  */
object Map {
  def main(args : Array[String]) ={
    var m = scala.collection.immutable.Map("first" -> "1" ,
    "second" -> "2")

    println(m)
    println("&&&&&&&&&&&&&&&&&&&&&&&&")
    for(i <- m){
      println(i)
    }

    println("***********************")
    for((k,v) <- m){
      println("k: " + k +" v: "+v)
    }

    println("^^^^^^^^^^^^^^^^^^^^^^^")
    m +=("third" -> "3")

    println(m)

    println("$$$$$$$$$$$$$$$$$$")
    m += ("third" -> "*_3_*")

    println(m)

    println("%%%%%%%%%%")
    print(m("first"))

    //m("first") = "%_1_%"  Error: Immutable map compile time doesnt allow to change

    var m_im = scala.collection.mutable.Map("first_im" -> "1" ,
      "second_im" -> "2")

    println("$$$$$$$$$$$$$$$$$$")
    println(m_im)

    m_im("first_im") ="%_1_%"

    println("###################")
    println(m_im)


  }

}
