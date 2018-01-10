/**
  * In Java,mathematical methods such as sqrt are defined as a static methods of the
  * Math class.In Scala,you define such methods in singleton objects.
  * A package can have a package object.In that case,you can import the
  * package and use the methods of the package object without any prefix:
  */

import scala.math._ // In Scala, the _ character is a "wildcard," like * in Java
sqrt(2)
pow(2,4)
min(3,Pi)
// If you don't import the scala.math package,add the package name:
scala.math.sqrt(2)
// If a package that start with scala. you can omit the scala prefix.
// import math._ equivalent to import scala.math._
// math.sqrt(2) is the same as scala.math.sqrt(2)

/*
Often,a class has a companion object whose methods act just like static methods
do in Java.For example,the BigInt companion object to the scala.math.BigInt class
has a method probablePrime that generates a random prime number with a given number of bits:
 */
BigInt.probablePrime(100,scala.util.Random)

/*
In Scala,it is common to use a syntax that looks like a function call.
For example, if s is a string, then s(i) is the ith character of the string.
C++ s[i] or java s.charAt(i)
 */
val s = "Hello"
s(4)
// implicit parameter
// "Bonjoir".sorted(3) is error
// because the sorted method can optionally be called with an ordering
// but 3 is not a valid ordering.you can use parentheses:
//("Bonjour".sorted)(3)
// or call apply explicitly

"Bonjour".sorted.apply(3)

BigInt("1234567890")
// is a shortcut for
BigInt.apply("1234567890")

pow(sqrt(3),2)

