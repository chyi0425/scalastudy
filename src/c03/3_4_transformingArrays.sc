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

// Alternatively,you could write
a.filter(_ % 2 == 0).map(2 * _)
// or even
a filter (_ % 2 == 0) map (2 * _)
//Some programmers with experience in functional programming prefer filter and map to guards and yield.
//That's just a matter of style--the for/yield loop does exactly the same work.Use whichever you find easier.

//Suppose we want to remove all negative elements from an array buffer of integers.A traditional sequential solution might
// traverse the array buffer and remove unwanted elements as they are encountered.
val b = a.toBuffer
var n = b.length
var i = 0
while (i < n) {
  if (a(i) >= 0) i += 1
  else {
    b.remove(i); n -= 1
  }
}
// That's a bit fussy--you have to remember not to increment i when you remove the element,and to decrement n instead.
// It is also not efficient to remove elements from the middle of the array buffer.This loop unnecessary moves elements that
// will later be removed.
// In Scala,the obvious solution is to use a for/yield loop and keep all non-negative elements:
var result1 = for (elem <- a if elem >= 0) yield elem
// The result is a new array buffer.Suppose we want to modify the original array buffer instead,removing the unwanted
// elements.Then we can collect their positions:
val positionsToRemove = for (i<- a.indices if a(i) <0)yield i
// Now remove the elements at those positions,starting from the back:
for(i<- positionsToRemove.reverse) b.remove(i)

// Or better,remember the positions to keep,copy them over,and then shorten the buffer:
val positionsToKeep = for(i<-a.indices if a(i) >=0) yield i
for(j<-positionsToKeep.indices) b(j) = b(positionsToKeep(j))
b.trimEnd(b.length - positionsToKeep.length)
// The key observation is that it is better to have all index values together instead of seeing them one by one.