// Since Scala arrays are implemented as Java arrays,you can pass them back and forth between Java and Scala.
// This works in almost all cases,except if the array element type isn't an exact match.In Java,an Array of
// a given type is automatically converted to an array of a supertype.For example,a Java String[] array can
// be passed to a method that expects a Java Object[] array.Scala does not permit this automatic conversion
// because it is unsafe.

//Suppose you want to invoke a Java method with an Object[] parameter,such as java.util.Arrays.binarySearch(Object[] a,Object key):
val a = Array("Mary","a","had","lamb","little")
//java.util.Arrays.binarySearch(a,"beef") //Does not work
//This does not work because Scala will not convert an Array[String] into an Array[Object].You can force the conversion like this:

java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]],"lamb")
// This is just an example to show how to overcome element type differences.If you want to carry out binary search in Scala.
import scala.collection.Searching._
 a.search("lamb")
 a.search("beef")

// The result is Found(n) if the element was found at position n or InsertionPoint(n) if the element was not found
// but should be inserted before position n.

// If you call a Java method that receives or return a java.util.List,you could,of course,use a Java ArrayList in your
// Scala code--but that is unattractive.Instead,import the implicit conversion methods in scala.collection.JavaConversions.
// Then you can use Scala buffers in your code, and they automatically get wrapped into Java lists when calling a Java method.


