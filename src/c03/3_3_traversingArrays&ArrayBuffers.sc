// In Java and C++,there are several syntactical differences between arrays and array list/vectors.
// Scala is much more uniform.Most of the time,you can use the same code for both.
// Here is how you traverse an array or array buffer with a for loop
val a = Array[Int](1,2,3,5)
a(0) = 7
for(i <- 0 until a.length)
  println(s"$i,${a(i)}")

for(i <- 0 to a.length-1)
  println(s"$i,${a(i)}")
// The until method is similar to the to method,except that it excludes the last
// value.Therefore,the variable i goes from 0 to a.length-1

// To visit every second element
for(i <- 0 until a.length by 2)
  println(s"$i,${a(i)}")

// To visit the elements starting from the end of the array,traverse
for (i<- 0 until a.length by -1)
  println(s"$i,${a(i)}")
for (i<- (0 until a.length).reverse)
  println(s"$i,${a(i)}")

// Instead of 0 until a.length ,you can use a.indices
a.indices
for(i <- a.indices)
  println(s"$i,${a(i)}")

for(i <- a.indices.reverse)
  println(s"$i,${a(i)}")

// If you don't need the array index in the loop body,visit the array elements directly:
for (elem <- a){
  println(elem)
}