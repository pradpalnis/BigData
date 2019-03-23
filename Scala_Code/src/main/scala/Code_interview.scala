/**
  * Created by User on 2/17/2019.
  */
object Code_interview {
  def main(args : Array[String]) = {

    /*var list_ = List(1,2,3,4)
    var list_list = List(list_)

    println(" first list" + list_ + " Second list " + list_list)*/

    val stringToCheck = "melionyhlhas"

    val dict = List("hello", "has", "my", "lion")


    def substrings(input: String) = {
      def goSubString(inp: String, acc: String): Unit = {
        if (inp.isEmpty && dict.contains(acc)) {
          println(acc)
        }
        if (!input.contains(acc) || inp.isEmpty) {
          //      println(acc)
          return
        }
        goSubString(inp.tail, acc + inp.head)
        goSubString(inp.tail, acc)
      }

      goSubString(input, "")
    }

    substrings("melionyhlhas")
  }
}
