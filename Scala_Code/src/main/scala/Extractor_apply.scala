/**
  * Created by User on 2/17/2019.
  */
object Extractor_apply {

  def main(args :Array[String]) ={
  println("Apply  :"+ apply("Pradeep","kumar") )
    println("UnApply  :"+ unapply("Pradeep kumar") )
    println("UnApply  :"+ unapply("Pradeep") )
  }

  def apply(fname:String,lname:String ) : String ={
    return fname +" "+ lname
  }

  def unapply(fullname:String) :Option[(String,String)] ={
    var n = fullname.split(" ")

    if(n.length == 2)
      return Some(n(0),n(1))
    else
      None

  }

}
