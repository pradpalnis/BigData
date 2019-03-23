/**
  * Created by User on 2/17/2019.
  */

import scala.util.matching.Regex
object Regex_Class {

  def main(args:Array[String]) ={
    val pattern = "Scala".r
    val str = "Scala is most popular "
    val str1 = "java is most popular "

    println (pattern findFirstIn( str ))
    println (pattern findFirstIn( str1 ))


    val pattern1 = new Regex("Scala")
    val str2 = "Scala is scalable and cool"

    println(pattern1 replaceFirstIn(str2, "Java"))


    val pattern2 = new Regex("abl[ae]\\d+")
    val str3 = "ablaw is able1 and cool"

    println((pattern2 findAllIn str3).mkString(","))

  }

}
