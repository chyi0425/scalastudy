def square(x:Int) = x*x
square(2)
val answer = 8*5 + 2
// A value declared with val is actually a constant--you can't change its contents:
//answer = 0
// To declare a variable whose contents can vary, use a var:
var counter = 0
counter = 1  // OK, can change a var
/**
  *Note that you need not specify the type of a value or variable.
  * It is inferred from the type of expression with which you initialize it.
  * It is an error to declare a value or variable without initializing it.
  *
  * However,you can specify the type if necessary.
  **/
val greeting0: String = null
val greeting1: Any = "Hello"
// You can declare multiple values or variables together
val xmax , ymax = 100 // Sets xmax and ymax to 100

// Scala has seven numeric types:Byte,Char,Short,Int,Long,Float,And Double
// and a Boolean Type.
// However,unlike Java,these types are classes.There is no distinction between
// primitive types and class types in Scala.
// you can invoke methods on numbers,for examples:
1.toString() // Yields the string "1"
1.to(10) // Yields Range(1,2,3,4,5,6,7,8,9,10)

"Hello".intersect("World") // Yields "lo"
/**
  * + - * / %
  * There is just one surprising aspect:These operators are actually methods.
  * For example
  * a+b is a shorthand for a.+(b)
  * Here,+ is the name of the method.
  * Scala has not silly prejudice against non-alphanumeric characters in method names.
  * You can define methods with just about any symbols for names.
  * For example,the BigInt class defines a method called /% that
  * returns a pair containing a the quotient and remainder of a devision
  * In general, you can write
  * a method b
  * as a shorthand for
  * a.method(b)
  *
  * There is one notable difference between Scala and Java or C++.
  * Scala does not have ++ or -- operators.Instead,simply use +=1 or -=1
  */
counter+=1 // Increments counter ---- Scala has no ++
counter
counter-=1
counter

val x:BigInt = 1234567890
x*x*x
// If the method has no parameters,you don't have to use parentheses.
"Bonjour".sorted
