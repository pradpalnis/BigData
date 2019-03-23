/**
  * Created by User on 2/17/2019.
  */
object Case_Class_objFile {
    case class Person (name : String , age :Int)

    def main(args:Array[String]) ={
      var p_obj = new Person("Pradeep",25)
      println("name : "+p_obj.name + " age " + p_obj.age)
    }



}
