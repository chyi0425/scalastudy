/*
Scala has a pleasant syntax for creating,querying,and traversing maps.
You need to choose between mutable and immutable maps.
By default,you get a hash map,but you can also get a tree map.
You can easily convert between Scala and Java maps.
Tuples are useful for aggregating values.
 */
// You can construct a map as:
val score = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
// This constructs an immutable Map[String,Int] whose contents can't be changed. If you want a mutable map,use
val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
// If you want to start out with a blank map,you have to supply type parameters:
val scores2 = scala.collection.mutable.Map[String, Int]()
//In Scala,a map is a collection of pairs.A pair is simply a grouping of two values,not necessarily of the same type,
// such as("Alice",10)
// The -> operator makes a pair.The value of
"Alice" -> 10
// is
("Alice", 10)
//You could have equally well defined the map as:
val score3 = Map(("Alice" -> 10), ("Bob" -> 3), ("Cindy" -> 8))
val score4 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
// The -> operator is just a little easier on the eyes than parentheses.It also supports the intuition
// that a map data structure is a kind of unction that maps keys to values,and a map just look them up.