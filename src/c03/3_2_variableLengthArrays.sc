//Java has ArrayList and C++ has vector for arrays that grow and shrink on demand.
//The equivalent in Scala is the ArrayBuffer.
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()//Or new ArrayBuffer[Int]
// An empty array buffer,ready to hold integers
b += 1 //ArrayBuff(1)
b
b+= (1,2,3,5) //ArrayBuffer(1,1,2,3,5)
b
b++=Array(8,13,21) //ArrayBuffer(1,1,2,3,5,8,13,21)
// You can append any collection with the ++= operator

b.trimEnd(5) //ArrayBuffer(1,1,2)  Removes the last five element

// You can also insert and remove elements at an arbitrary location,
// but those operations are not as efficient--all elements after that location
// must be shifted
b.insert(2,6)
b
b.insert(2,7,8,9)
b
b.remove(2)
b
b.remove(2,3) //The second parameter tells how many element to remove
b

// Sometimes,you want to build up an array,but you don't yet know how many
// elements you will need.
b.toArray

//Conversely,call a.toBuffer to convert the array to an array buffer
val s = Array("Hello","World")
s.toBuffer