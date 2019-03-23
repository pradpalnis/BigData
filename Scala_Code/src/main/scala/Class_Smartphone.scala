/**
  * Created by User on 2/17/2019.
  */
class Class_Smartphone {

  var s_no: Int = 0
  var name : String = ""

  def display() ={
    println("Details " + s_no + " " + name)
  }

  def add_details( no :Int , n :String) ={
    this.s_no = no
    this.name = n
  }

}
