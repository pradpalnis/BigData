/**
  * Created by User on 2/17/2019.
  */
object Case_Class {
  case class Person (name : String , var age :Int)

  def main(args:Array[String]) ={
    var p_obj = new Person("Pradeep",25)
    println("name : "+p_obj.name + " age " + p_obj.age)

    //p_obj.name ="kumar" //Erro val name
    p_obj.age = 27

    println("name : "+p_obj.name + " age " + p_obj.age)

    var p_obj2 = p_obj.copy()

    println("name : "+p_obj2.name + " age " + p_obj2.age)

    println(p_obj == p_obj2)

    p_obj2.age = 14

    println("::::::::::::::DEEP COPY::::::::::::::::::::::::::::")

    println("name : "+p_obj2.name + " Changed age " + p_obj2.age) //Deep copy , original doesnt chnage
    println("name : "+p_obj.name + " original age same" + p_obj.age)

    println(p_obj == p_obj2)


    println("::::::::::::::SHALLOW COPY::::::::::::::::::::::::::::")
    var p_obj3 = p_obj2


    println("name : "+p_obj3.name + "  age " + p_obj3.age)
    println("name : "+p_obj2.name + "  age " + p_obj2.age)


    p_obj3.age = 18

    println("name : "+p_obj3.name + " Changed age " + p_obj3.age) //Shallow copy original changed
    println("name : "+p_obj2.name + " original age same" + p_obj2.age)

  }

}
