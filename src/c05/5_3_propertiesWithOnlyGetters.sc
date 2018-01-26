// Sometimes you want a read-only property with a getter but no setter.If the value of the property never changes
// after the object has been constructed,use a val field:
class Message{
  val timeStamp = java.time.Instant.now

}
// The Scala compiler produces a Java class with a private final field and a public getter method,but no setter.

// You can't implement such a property with a val--a val never changes.Instead,provide a private field and a property
// getter,like this:
class Counter{
  private var value=0
  def increment(): Unit ={
    value+=1
  }
  def current = value // no () in declaration
}

// Note that there are no () in the definition of the getter method.Therefore,you must call the method without parentheses:
val myCounter = new Counter
val  n = myCounter.current
// To summarize,you have four choices for implementing properties:
// 1. var foo:Scala synthesizes a getter and a setter.
// 2.val foo:Scala synthesizes a getter.
// 3.You define methods foo and foo_=.
// 4.You define a method foo.

// NOTE:In Scala,you cannot have a write-only property(that is, a property with a setter and no getter).