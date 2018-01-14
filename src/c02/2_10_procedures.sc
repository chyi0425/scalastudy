// Scala has a special notation for a function that returns no value.
//If the function body is enclosed in braces without a preceding = symbol
//then the return type is Unit.Such a function is called a procedure.
// A procedure returns no value,and you only call it for its side effect.

//Since the procedure doesn't return any value,we omit the = symbol.
def box(s: String): Unit = { // Look carefully:no =
	val border = "-" * (s.length + 2)
	print(f"$border%n|$s|%n$border%n")
}

box("Hello")