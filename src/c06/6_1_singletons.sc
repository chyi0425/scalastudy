/*
In this short chapter,you will learn when to use construct in Scala.Use it when you need a class with a single instance,
or when you want to find a home for miscellaneous value of functions.
The key points of this chapter are:
Use objects for singletons and utility methods.
A class can have a companion object with the same name.
Object can extends classes or traits.
The apply method of an objects is usually used for constructing new instances of the companion class.
To avoid the main method,use an object that extends the App trait.
You can complement enumerations by extending the Enumeration object.

 Scala has no static methods or fields.Instead,you use the object construct.An object defines a single instance
 of a class with the features that you want.For example.,
 */
object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

/*
When you need a new unique account number in your application,call Account.newUniqueNumber().
The constructor of an object is executed when the object is first used.In our example,The Accounts
constructor is executed with the first call to Accounts.newUniqueNumber().If an object is never used,
its constructor is not executed.
An object can have essentially all the features of a class--it can even extend other classes or traits.
There is just one exception:You cannot provide constructor parameters.
Use an object in Scala whenever you should have used a singleton object in Java or C++:
As a home for utility functions or constants.
When a single immutable instance can be shared efficiently
When a single instance is required to coordinate some service(the singleton design pattern)

NOTE:Many people view the singleton design pattern with disdain.Scala gives you the tools
for both good and bad design,and it is up to you to use them wisely.
 */