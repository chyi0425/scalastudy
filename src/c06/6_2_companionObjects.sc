/*
In Java or C++,you often have a class with both instance methods and static methods.In Scala,you
can achieve this by having a class and a "companion" object of the same name.For example,
 */
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount:Double): Unit ={
    balance += amount
  }
}

object Account { //The companion object
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}
/*
The class and its companion object can access each other's private features.They must be located in
the same source file.
Note that the companion object's features are not in the scope of the class.For example,the Account
class has to use Account.newUniqueNumber() and not just newUniqueNumber() to invoke the method of the
companion object.

TIP: In the REPL,you must define the class and the object together in paste mode.Type
:paste
Then type or paste both the class and object definitions,and type Ctrl+D.

NOTE:A companion object contains features that accompany a class.In Chapter 7,you will see how to add
features to a package using a package object.
 */