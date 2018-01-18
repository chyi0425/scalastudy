// Like in Java,multidimensional arrays are implemented as arrays of arrays.For example,a two-dimensional array of Double
// values has the type Array[Array[Double]].To construct such an array,use the ofDim method:
val matrix = Array.ofDim[Double](3,4)
//To access an element,use two pairs of parentheses:
//matrix(row)(column) = 42

//You can make ragged arrays,with varying row lengths:
val triangle = new Array[Array[Int]](10)
for(i <- triangle.indices)
  triangle(i) = new Array[Int](i+1)

