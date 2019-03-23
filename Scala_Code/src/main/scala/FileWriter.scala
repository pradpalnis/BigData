/**
  * Created by User on 2/17/2019.
  */

import java.io._

import scala.io.Source
import scala.io.Source._
object FileWriter {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test1.txt" ))

    writer.write("Hello Scala welcome")
    writer.close()

    fromFile("test.txt" ).foreach {
      print
    }

    var f_content = fromFile("test2").getLines().toList
    var words:List[String] = List()

    for(l <- f_content)
      {
        var arr: List[String] = l.split(' ').toList
        words = words ::: arr

      }
    print(words)

    var m = scala.collection.mutable.Map[String,Int]()
    for(w <- words)
      {
      if(m.contains(w))
        {
          var v = m(w)
          m(w) = v+1
        }
        else
        {
          m +=(w ->1 )
        }
      }

    println(m)





  }
}
