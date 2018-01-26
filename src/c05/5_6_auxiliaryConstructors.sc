/*
As in Java or C++,a Scala class can have as many constructor as you like.How ever,a Scala class one constructor
that is more important than all the others,called primary constructor.In addition,a class may have any number of
auxiliary constructors.
We discuss auxiliary constructors first because they are easier to understand.They are similar to constructors
in Java or C++,with just two differences.
1.The auxiliary constructors called this.(In Java or C++,constructors have the same name as the class--which
is not so convenient if you rename the class.)
2.Each auxiliary constructor must start with a call to a previously defined auxiliary constructor or the
primary constructor.
Here is a class with two auxiliary constructors:
 */
class Person{
  private var name=""
  private var age = 0

  def this(name:String){ // An auxiliary constructor
    this()  // Calls primary constructor
    this.name = name
  }

  def this(name:String,age:Int){ // Another auxiliary constructor
    this(name)  // Calls previous auxiliary constructor
    this.age = age
  }
}
/*
We will look at the primary constructor in the next section.For now,it is sufficient to know that a
class for which you don't define a primary constructor has a primary constructor with no arguments.
You can constructor objects of this class in three ways:
 */
val p1 = new Person //Primary constructor
val p2 = new Person("Fred") // First auxiliary constructor
val p3 = new Person("Fred",42) // Second auxiliary constructor