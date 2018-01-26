// In Scala(as well as in Java and C++),a method can access the private fields of all object of its class.For example:
class Counter {
  private var value = 0

  def increment(): Unit = {
    value += 1
  }

  def ieLess(other: Counter): Boolean = value < other.value

}

// Accessing other.value is legal because other is also a Counter object.

//Scala allows an even more severe access restriction with the private[this] qualifier:
// private[this] var value = 0
// Now the methods of the Counter class can only access the value field of the current object,not of other
// object of type Counter.This access is sometimes called object-private,and it is common in some OO languages
// such as SmallTalk.

// With a class-private field,Scala generates private getter and setter methods.However,for an object-private field,
// no getters and setters are generated at all.

// Note:Scala allows you to grant access rights to specific classes.The private[ClassName] qualifier states that only
// methods of the given class can access the given field.Here,the ClassName must be the name of the class being defined
// or an enclosing class.
// In this case,the implementation will generate auxiliary getter and setter methods that allow the enclosing class to
// access the field.These methods will be public because the JVM does not have a fine-grained access control system,and
// they will have implementation-dependent names.