// There are two common implementation strategies for maps:hash tables and balanced trees.Hash tables use the hash
// codes of the keys to scramble entries,so iterating over the elements yields them in unpredictable order.
// By default,Scala gives you a map based on a hash table because it is usually more efficient.
// If you need to visit the keys in sorted order,use a SortedMap instead.
val scores = scala.collection.mutable.SortedMap("Allice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
// If you want to visit the keys in insertion order,use a LinkedHashMap.For example
val month = scala.collection.mutable.LinkedHashMap("January" -> 1, "February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5)