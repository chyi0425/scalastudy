// Sometimes,it is convenient to implement a function that can take a variable number of arguments
// The following example shows the syntax:
def sum(args: Int*) = {
	var result = 0
	for (arg <- args) result += arg
	result
}
//You can call this function with as many arguments as you like.
val s = sum(1, 4, 8, 16, 25) // yield 54
// If you already have a sequence of values,you cannot pass it directly to such a function.
//For example, the following is not correct:
//val s = sum(1 to 5) //Error
// If the sum function is called with one argument,that must be a single integer, not a range
// of integers.The remedy is to tell the compiler that you want the parameter to be considered an
// argument sequence.Append: _*, like this:
val s1 = sum(1 to 5: _*) // Consider 1 to 5 as an argument sequence

// This call syntax is need in a recursive definition
def recursiveSum(args: Int*): Int = {
	if (args.length == 0) 0
	else args.head + recursiveSum(args.tail: _*)
}
// Here, the head of a sequence is its initial element,and tail is a sequence of all other
// elements.That's again a Seq,and we have to use :_* to convert it to an argument sequence.
var s2 = recursiveSum(1 to 5: _*)