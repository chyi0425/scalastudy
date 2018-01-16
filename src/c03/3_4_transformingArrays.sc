val a = Array(2, 3, 5, 6, 11)
val result = for (elem <- a) yield 2 * elem
// The for yield loop creates a new collection of the same type as the original
// collection.If you started with an array,you get another array.If you started with an array buffer,
// that's what you get from for/yield.
// The result contains the expressions after the yield,one for each iteration of loop.

//Oftentimes,when you traverse a collection,you only want to process the elements
// that match a particular condition.This is achieved with a guard:an if inside the
// for.Here we double every even element,dropping the odd ones:
for (elem <- a if elem % 2 == 0) yield 2 * elem
// Keep in mind that the result is a new collection--the original collection is not affected.
