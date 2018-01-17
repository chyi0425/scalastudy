import scala.collection.mutable.ArrayBuffer
// Ti is often said that a large percentage of business computations are nothing but computing sums and sorting.
// Fortunately,Scala has build-int functions for these tasks.
Array(1,2,5,9,3).sum //Works for ArrayBuffer too
ArrayBuffer(5,2,7,8).sum
// In order to use the sum method,the element type must be a numeric type:either an
// integral or floating-point type or BigInteger/BigDecimal.
// Similarly,the min and max method yield the smallest and largest element in
// an array or array buffer.
ArrayBuffer("Mary","had","a","little","lamb").max
// The sorted method sorts an array or array buffer and returns the sorted array or array buffer,without modifying the original:
val b = ArrayBuffer(1,6,7,2,9)
val bSorted = b.sorted // b in unchanged;bSorted is ArrayBuffer(1, 2, 6, 7, 9)
// You can also supply a comparison function,but then you should use the sortWith method:
val bDescending = b.sortWith(_ > _)

// You can sort an array,but not an array buffer,in place:
val a = Array(1,7,2,9)
scala.util.Sorting.quickSort(a) // a is now Array(1,2,7,9)
// For the min,max,and quickSort methods,the element type must have a comparison operation.
// This is the case for numbers,strings,and other types with the Ordered trait.

// Finally,if you want to display the contents of an array or array buffer,th mkString method lets you specify
// the separator between elements,A sceond variant has parameters for the prefix and suffix.For example,
a.mkString(" and ") //res14: String = 1 and 2 and 7 and 9
a.mkString("<",",",">") //String = <1,2,7,9>

// Contrast with toString
a.toString  //res16: String = [I@2808ca34
// This is useless toString method from Java
b.toString //res17: String = ArrayBuffer(1, 6, 7, 2, 9)
// The toString method reports the type,which is useful for debugging