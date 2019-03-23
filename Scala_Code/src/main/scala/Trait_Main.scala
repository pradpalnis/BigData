/**
  * Created by User on 2/17/2019.
  */
object Trait_Main {

  def main(args:Array[String]) ={

    var t_ext = new Trait_Extended()
    t_ext.common_details();
    t_ext.display()
    print(t_ext.trait_param)

    print("__________________&______________")

    var ts_ext = new Trait_Ext_both()
    ts_ext.common_details()
    ts_ext.display()
    print(ts_ext.trait_param)

  }

}
