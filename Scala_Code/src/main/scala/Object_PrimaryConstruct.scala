/**
  * Created by User on 2/17/2019.
  */
object Object_PrimaryConstruct {

  def main(args :Array[String]) ={
    var c_p = new Class_PrimaryConstruct("one", "two")
    c_p.display()
    c_p.modify("mod_one","mod_two")
    c_p.display()
  }

}
