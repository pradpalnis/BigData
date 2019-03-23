/**
  * Created by User on 2/26/2019.
  */
object Currying {

  def main(args :Array[String]) = {

    def strcat(s1: String)(s2: String) = {
      s1 + s2
    }

    def add(a: Int)(b: Int) = {
      print(a +"**"+ b)

      a + b}


    val str1:String = "Hello, "
    val str2:String = "Scala!"

    println( "str1 + str2 = " +  strcat(str1)(str2) )

    val onePlusFive = add(1)(5) // 6

    val addFour = add(4)_ // (Int => Int)

    val twoPlusFour = addFour(2)

    assert(onePlusFive == twoPlusFour) // true

  }

}
