/**
  * Created by User on 2/15/2019.
  */
object StringMixSwap {

  def main(args: Array[String]): Unit = {
    var str1 = "ABC"
    var str2 = "DEF"
    var mix_str = ""

    var str1_array = str1.toCharArray()
    var str2_array = str2.toCharArray()
    var len = str1_array.length

    for( i  <- 0 to len-1){
      var char_c = str1_array(i).toString.concat(str2_array(i).toString)
      mix_str = mix_str.concat(char_c)
    }
  println(mix_str)

    println("Index" +str1(0))

    println (str1 union str2)

    println (str1 diff str2)

    println (str1 intersect str2)

    println (str1.sorted)

    //println (str1.sortBy())
  }
}
