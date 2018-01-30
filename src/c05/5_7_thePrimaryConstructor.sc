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
class Person(val name: String, val age: Int) {
  println("Just constructed another person")

  def description = s"$name is $age years old"
}

val p1 = new Person("Ferb", 42)

/*
the println statement is a part of the primary constructor.It is executed whenever an object is
constructed.
This is useful when you need to configure a field during construction.For example:.

 */
class MyProg {
  private val props = new Properties
  props.load(new FileReader("myprop.properties"))
  // The statement above is a part of the primary constructor
}

/*
NOTE:If there are no parameters after the class name,then the class has a primary constructor
with no parameters.That constructor simply executes all statements in the body of the class.
You can often eliminate constructors by using default arguments in the primary constructor.
For example:
 */
class Person1(val name: String = "", val age: Int = 0)

val person1 = new Person1()

/*
Primary constructor parameters can have any of the forms.For example
 */
class Person2(val name: String, private var age: Int)

// declares and initializes fields
// val name:String
// private var age:Int
/*
Construction parameters can also be regular method parameters,without val or var.How these parameters
are processed depends on their usage inside the class.
If a parameter without val or var is used inside oa least one method,it becomes a field.For example,
 */
class Person3(name: String, age: Int) {
  def description = s"$name is $age years old"
}

/*
declares and initializes immutable fields name and age that are object-private.Such a field is the equivalent
of a private[this] val field.
Otherwise,the parameter is not saved as a field.It's just a regular parameter that can be accessed in the code
of the primary constructor.(Strictly speaking,this is an implementation-specific optimization.)

Fields and Methods Generated for Primary Constructor Parameters
Primary Constructor Parameters      |     Generated Field/Methods
name:String                         | object-private field,or no field if no method uses name
private val/var name:String         | private field,private getter/setter
val/var name:String                 | private field,public getter/setter
@BeanProperty val/var name:String   | private field,public Scala and JavaBeans getters/setters

If you find the primary constructor notation confusing,you don't need to use if.Just provide one or more
auxiliary constructors in the usual way,but remember to call this() if you don't chain to another
auxiliary constructor.
However,many programmers like the concise syntax.Martin Odersky  suggests to think about it this way:
In Scala,class take parameters,just like methods do.
NOTE:When you think of the primary constructor's parameters as class parameters.parameters without val
or var become easier to understand.The scope of such a parameter is the entire class.There fore,you can
use the parameter in methods.If you do,it is compiler's job to save it in a field.

NOTE:To make a primary constructor private,place the keyword private like this:
 */
class Person4 private(val id: Int) {}

// A class user must then use an auxiliary constructor to construct a Person4 object.