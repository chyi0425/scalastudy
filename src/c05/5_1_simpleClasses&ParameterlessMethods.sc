/*
Fields in classes automatically come with getters and setters.
You can replace a field with a custom getter/setter without changing the client of a class--that is the "uniform access principle"
Use the @BeanProperty annotation to generate the JavaBeans getXxx/setXxx methods.
Every class has a primary constructor that is "interwoven" with the class definition.Its parameters turn into the fields fo the class.The primary constructor executes all statements in the body of the class.
Auxiliary constructors are optional.They are Called this.
 */
// In its simplest form,a Scala class looks very much like its equivalent in Java or C++:
class Counter{
  private var value = 0 // You must initialize the field
  def increment(){value +=1} // Method are public by default
  def current() = value
}
// In Scala,a class is not declared as public.
// A Scala source file can contain multiple classes,and all of them have public visibility.
// To use this class,you construct objects and invoke methods in the usual way:
val myCounter = new Counter
myCounter.increment()
println(myCounter.current())
