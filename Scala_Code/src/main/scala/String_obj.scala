/**
  * Created by User on 2/17/2019.
  */
object String_obj {

  def main(args:Array[String]) ={

    var s = "IQVIA"

    println(s.reverse)

    println(s.charAt(1))

    var str = new StringBuilder
    for( i <- 0 until s.length){
      str.append(s.charAt(s.length-1-i))

    }

    println(str)

  }

}
