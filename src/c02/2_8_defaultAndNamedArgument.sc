// You can provide default arguments for function that are used when you don't specify explicit values.For example
def decorate(str: String, left: String = "[", right: String = "]") =
	left + str + right

decorate("Hello") // yield [Hello]
decorate("Hello", "<<<", ">>>") // yield <<<Hello>>>

//If you supply fewer arguments than there are parameters,the defaults are applied
// from the end.For example,decorate("Hello",">>>[") uses the default value of the right parameter,
decorate("Hello", ">>>[")

// You can also specify the parameter names when you supply the arguments.For exapmple,
decorate(left = "<<<", str = "Hello") // yield <<<Hello]
//Note that the named arguments need not be in the same order as the paraments.

// You can mix unnamed and named arguments, provided the unnamed ones come first:
decorate("Hello", right = "]<<<") //Calls decorate("Hello","[","]<<<")