// In Scala, the analogy between functions and maps is particularly chose because you use the () notation
// to look up key values.
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val bobScore = scores("Bob") // Like scores.get("Bob") in Java
// If the map doesn't contain a value for the requested key,an exception is thrown.
// scores("23") //java.util.NoSuchElementException: key not found: 23
// To check whether there is a key with the given value,call the contains method:
val bobScore1 = if (scores.contains("Bob")) scores("Bob") else 0
// Since this call combination is so common,there is a shortcut:
val bobScore2 = scores.getOrElse("Bob", 0)

//Finally,the call map.get(key) returns an Option object that is either Some(value for key) or None.

// Given an immutable map,you can turn it into a map with a fixed default value for keys that are not present,or a function
// to compute such values.
val scores1 = scores.withDefaultValue(0)
val zeldasScore1 = scores1.get("Zelda")

val scores2 = scores.withDefault(_.length)
val zeldasScore2 = scores2.get("Zelda")


