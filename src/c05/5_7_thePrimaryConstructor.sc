import java.io.FileReader
import java.util.Properties


/*
In Scala,every class has a primary constructor.The primary constructor is not defined with a
this method.Instead,it is interwoven with the class definition.
1.The parameters of the primary constructor are placed immediately after the class name.
  class Person(val name:String,val age:Int){
    // Parameters of primary constructor in(...)
  }
Parameters of the primary constructor turn into fields that are initialized with the construction
parameters.In our example,name and age become fields of the Peron class.A constructor call such as
new Person("Fred",42) sets the name and age fields.
Half a line of Scala is the equivalent of seven lines of Java:
        public class Person{ //This is Java
        private String name;
        private int age;
        public Person(String name,int age){
        ....
        }
        }

2.The primary constructor executes all statements in the class definition.For example,in the following class
 */
class Person(val name:String,val age:Int){
  println("Just constructed another person")
  def description = s"$name is $age years old"
}
val p1 = new Person("Ferb",42)
/*
the println statement is a part of the primary constructor.It is executed whenever an object is
constructed.
This is useful when you need to configure a field during construction.For example:.

 */
class MyProg{
  private val props =new Properties
  props.load(new FileReader("myprop.properties"))
  // The statement above is a part of the primary constructor
}