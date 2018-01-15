/*
Key points of this chapter:
Use an Array if the length is fixed,and an ArrayBuffer if the length can vary.
Don't use new when supplying initial values.
Use () to access elements.
Use for (elem <- arr) to traverse the element.
Use for (elem <- arr if ...) ... yield ... to transform into a new array.
Scala and Java arrays are interoperable; with ArrayBuffer,use scala.collection.JavaConversions.
 */

// If you need an array whose length doesn't change,use the Array type in Scala.
val nums = new Array[Int](10)//An array of the integers,all initialized with zero
val a = new Array[String](10)//An array with ten elements,all initialized with null
val s = Array("Hello","World")//An array[String] of length 2--the type is inferred
// Note: No new when you supply initial values

s(0) = "Goodbye" //Array("Goodbye","World").Use()instead of[] to access elements
s
