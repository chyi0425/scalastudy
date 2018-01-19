// The following amazingly simple loop iterates over all key/value pairs of a map:
//for((k,v)<-map) process k and v
// The magic here is that you can use pattern matching in a Scala for loop.That way,you get the key and value of each pair in the map
// without tedious method calls.
// If for some reason you want to visit only the keys or values,use the keySet and values methods, as you would in Java.
// The values method returns a Iterable
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
scores.keySet
scores.keys
for (v <- scores.keySet) println(v)

for (v <- scores.keys) println(v)

for (v <- scores.values) println(v)

for (v <- scores.valuesIterator) println(v)

// To reverse a map--that is,switch keys and values--use
for ((k, v) <- scores) yield (v, k)