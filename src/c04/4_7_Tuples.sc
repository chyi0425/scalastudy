// Maps are collections of key/value pairs.Pairs are the simplest case of tuples--aggregates of values of different types.
// A tuple value is formed by enclosing individual values in parentheses.For example
//If you have a tuple,say,
val t = (1, 3.14, "Fred")
// then you can access its components with the mothods _1,_2,_3,for example:
val sceond = t._2
//Unlike array or string positions,the component positions of a tuple start with 1,not 0.

//Usually ,it is better to use pattern matching to get at the components of a tuple,for example
val (first, second, third) = t // Sets first to 1,second to 3.14,third to "Fred"
first
sceond
third

//You can use a _ if you don't need all components:
//val(first,second,_) = t

//Tuples are useful for functions that return more than one value.For example,tha partition method of the StringOps
//class returns a pair of strings containing the characters that fulfill a condition and those that don't:
"New York".partition(_.isUpper)