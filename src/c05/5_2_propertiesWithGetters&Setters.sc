// When writing a Java class,we don't like to use public fields.
//With a public field,anyone could write to fred.age,making Fred younger or older.
// That's why we prefer to use getter and setter methods.

// A getter/setter pair such as this one is often called a property.
// Getters and setters are better than public fields because
// they let you start with simple get/set semantics and evolve them as needed
// Just because getters and setters are better than public fields doesn't mean they are always good.Often,it is plainly
// bad if every client can get or set bits and pieces of an object's state.In this section,I show you how to implement
// properties in Scala.It is up to you to choose wisely when a gettable/settable property is an appropriate design.

// Scala provides getter and setter methods for every field.Here,we define a public field
class Person {
  var age = 0;
}

//Scala generates a class for the JVM with a private age field and getter and setter methods.
// These methods are public because we did not declare age as private.(For a private field,
// the getter and setter methods are private.)

// In Scala,the getter and setter methods are called age and age_=.
val fred = new Person
println(fred.age)
fred.age = 21
println(fred.age)

// At any time,you can redefine the getter and setter methods yourself.For example,
class Person1 {
  private var privateAge = 0

  def age = privateAge

  def age_=(newValue: Int): Unit = {
    if (newValue > privateAge) privateAge = newValue
  }
}

// The user of your class still accesses fred.age,but now Fred can't get younger.
var fred1 = new Person1
fred1.age = 30
fred1.age = 21
println(fred1.age)
// It may sound scary that Scala generates getter and setter methods for every field.But you have some controll over this process.
// If the field is private,the getter and setter are private.
// If the field is a val,only a getter is generated.
// If you don't want any getter or setter,declare the field as private[this]