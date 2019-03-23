/**
  * Created by User on 2/17/2019.
  */
object Set_Object {
  def main(args : Array[String]) ={
    var set1 = Set(1,2,3,7,8,9)//immutable

    var set2 = Set(3,4,5,12,33,45)

    for(s <- set1)
      {
        println(s)
      }

    println("*************")
    println(set1)

    println(set1.union(set2))
    println(set1.intersect(set2))
    println(set1.diff(set2))

    var set4 = scala.collection.mutable.Set[Int]()
    set4 += (4)
    println("_____________________")
    println(set4);
    println("_____________________*_____________________")
    set4.foreach((x:Int) => println(x) )



    set4++== set1

    println(set4);

    set4 -= 4
    println(set4);
    set4 --= List(1, 2)
    println(set4);

    set4.retain(_>5)

    println(set4);
  }

}
