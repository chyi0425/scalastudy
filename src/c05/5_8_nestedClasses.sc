/*
In Scala,you can nest just about anything inside anything.You can define functions inside other functions,and
classes inside other classes.Here is a simple example of the latter:.
 */

import scala.collection.mutable.ArrayBuffer

class Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }
}

// Consider two networks:
val chatter = new Network
val myFace = new Network
/*
In Scala,each instance has its own class Member,just like each instance has its own field members.
That is, chatter.Member and myFace.Member are different classes.
NOTE:This is different from Java,where an inner class belongs to the outer class.
The Scala approach is more regular.For example,to make a new inner object,you simply use new with
the type name:new chatter.Member.In Java,you need to use a special syntax,chatter.new Member().
In our network example,you can add a member within its own network,but not across networks.
 */
val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
fred.contacts += wilma // OK
val barney = myFace.join("Barney") //Has type myFace.Member
//fred.contacts += barney // can't add a myFace.Member to a buffer of chatter.Member elements
/*
For networks of people,this behavior probably makes sense.If you don't want it,there are two solutions
First,you can move the Member type somewhere else.A good place would be the Network companion Object.
 */
object Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

}

//Alternatively,you can use a type projection Network#Member,which means "a Member of any Network."For example,
class Network1 {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network1#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }
}

/* You would do that if you want the fine-grained"inner class per object"feature in some places of your program,
but not everywhere.
Note: In a nested class,you can access the this reference of the enclosing class as EnclosingClass.this,like in Java.
If you like,you can establish an alias for that reference with the following syntax:
*/
class Metwork2(val name: String) {
  outer =>

  class Member(val name: String) {
    def description = s"$name inside ${outer.name}"
  }

}

/*
The class Network{ outer=> syntax makes the variable outer refer to Network.this.You can choose any name for this
variable.The name self is common,but perhaps confusing when used with nested classes.
This syntax is related to the "self type" syntax that you will see in Chapter 19.
 */