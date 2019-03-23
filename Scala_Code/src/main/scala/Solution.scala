import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._/**
  * Created by User on 2/24/2019.
  */
object Solution {
  def main(args: Array[String]) {


    val xCount = StdIn.readLine.trim.toInt

    val x = Array.ofDim[Int](xCount)

    for (i <- 0 until xCount) {
      val xItem = StdIn.readLine.trim.toInt
      x(i) = xItem
    }

    val yCount = StdIn.readLine.trim.toInt

    val y = Array.ofDim[Int](yCount)

    for (i <- 0 until yCount) {
      val yItem = StdIn.readLine.trim.toInt
      y(i) = yItem
    }

    val result = Result.getTriangleArea(x, y)

    print("result " + result)


  }
}
