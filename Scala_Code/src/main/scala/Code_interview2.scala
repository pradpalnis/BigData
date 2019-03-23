/**
  * Created by User on 2/17/2019.
  */
object Code_interview2 {
  def main(args : Array[String]) = {

    var s = "Happy"
    println("Head :"+s.head + " Tail: "+ s.tail)
    println("Head :"+s.head + " Tail: "+ s.tail.tail)



    println("________________________________________________")

    val l1 = List(1, 2, 3)
    val l2 = List('a', 'b', 'c')
    val l3 = List(7, 8, 9)

    val loop = for (
      x <- l1;
      y <- l2
      if x < 3
    ) yield (x.toString + y.toString)

    println(loop)

    val loop2 = l1.filter(x => x < 3)
    val loop3 = loop2.flatMap(x => l2.map(y => x.toString + y.toString))
    println(loop3)

    println("________________________________________________")

    def maxi(x: Int, y: Int) = if (x >= y) x else y

    def lengthOfLongestSubstring(s: String): Int = {
      def go(acc: String, original: String): Int = {
        if (original.isEmpty || acc.indexOf(original.head) != -1 || (acc.length != 1 && s.indexOf(acc + original.head) == -1)) {
          println(acc)
          return acc.length
        }
        maxi(go(acc + original.head, original.tail), go(acc, original.tail))
      }

      go("", s)
    }

    println(lengthOfLongestSubstring("abcabcbb"))


  }

}
