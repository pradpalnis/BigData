/**
  * Created by User on 2/17/2019.
  */
object Inheritance_Main {

  def main(args:Array[String]) ={

    var c_obj  = new Child_One()
    println(c_obj.child_param)
    println(c_obj.parent_param)
    println(c_obj.display())

    var p_obj  = new Parent()
    println(p_obj.display())
  }

}
