// In a mutable map,you can update a map value,or add a new one,with a () to the left of an = sign:
val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
scores("Bob") = 10
// updates the existing value fot the key "Bob"
scores("Fred") = 7 // Add a new key/value pair to scores(assuming it is mutable)
// Alternatively,you can use += operation to add multiple associations:
scores += ("Bob" -> 7, "Fred" -> 9)

// To remove a key and its associated value,use the -= operator:
scores -= "Alice"
// You can't update an immutable map,but you can do something
// that's just as useful--obtain a new map that has the desire update:
val newScores = scores + ("Bob" -> 7, "Fred" -> 9)