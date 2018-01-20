// One reason for using tuples is to bundle together values so that they can be processed together.
// This is commonly done with the zip method.For example,the code:
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
// yields an array of pairs Array((<,2), (-,10), (>,2))
//The pairs can then be processed together:
for ((s, n) <- pairs) print(s * n)
//The toMap method turns a collection of pairs into a map.
// If you have a collection of keys and a parallel collection of values,zip them up and turn them into a map like this:
// keys.zip(value).toMap
symbols.zip(counts).toMap