def square(x:Int) = x*x

square(2)

val answer = 8*5 + 2

0.5 * answer

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
val xmax,ymax = 100 // Sets xmax and ymax to 100
var greeting,message:String = null

1.toString()

1.to(10)