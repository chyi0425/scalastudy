// To define a function,specify the function's name,parameters,and body like this:
def abs(x: Double) = if (x > 0) x else -x
// You must specify the types of all parameters.However,as long as the function in not recursive,
//you need not specify the return type.The Scala compiler determines the return type from the type of
//expression to the right of the = symbol

//If the body of the function requires more than one expression,use a block.The last expression
// of the block becomes the value that the function returns.For example ,tht following function returns
// the value of r after the for loop
def fac(n: Int) = {
	var r = 1
	for (i <- 1 to n) r = r * i
	r
}
// There is no need for the return keyword in this example.

// With a recursive function, you must specify the return type.For example,
def fac1(n: Int): Int = if (n <= 0) 1 else n * fac1(n - 1)
// Without the return type,the scala compiler couldn't verify that the type of n * fac1(n-1) is a Int
