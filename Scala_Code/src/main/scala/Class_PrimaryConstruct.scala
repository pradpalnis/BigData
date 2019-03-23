/**
  * Created by User on 2/17/2019.
  */
class Class_PrimaryConstruct ( var  param_1 : String, var param_2:String) { //val cant modify compiler error

  def display()={
    println("Details of param 1 : " + param_1  + " param 2 :" + param_2)
  }

  def modify(str :String ,str1 :String)={
    this.param_1 = str
    this.param_2 = str1
  }

}
