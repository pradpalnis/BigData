/**
  * Created by User on 2/17/2019.
  */
class Trait_Ext_both extends Trait_Extended with Trait_Class_Second{

  println("__________Inside Trait_Ext_both Class")

  override val trait_param: String = "Overrided Trait_Ext_both"


  override def  common_details()= {
    println("Inside Trait_Ext_both class common_details method")
  }

  override def display()={
    println("override Trait_Ext_both display")

  }


}
