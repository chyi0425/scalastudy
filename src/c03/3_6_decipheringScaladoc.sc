//Deciphering Scala doc
//There are lots of useful methods on arrays and array buffers,and it is a good idea to browse the Scala documentation to get an idea of what's there
//Scala has a richer type system than Java,so you may encounter some strange-looking syntax as you browse the Scala documentation.
//Fortunately,you don't have to understand all nuances of the type system to do useful work.

/*
def count(p:(A) => Boolean:Int    This method takes a predicate,a function from A to Boolean.It counts for how many elements the function is true
 */
val a = Array(-3,-62,3,288,90,-23)
a.count(_>0)

/*
def append(elems:A*):Unit     This method takes zero or more arguments of type A
 */
val b = a.toBuffer
b.append(3,1,1,8888)
b
/*
def appendAll(xs:TraversableOnce[A]):Unit The xs parameter can be any collection with the TraversableOnce trait, a trait
                                      in the Scala collections hierarchy.Other common traits that you may encounter in
                                      Scala doc are Traversable and Iterable.All Scala collections implement these traits,
                                      and the difference between them is academic for library users.Simply think "any collection"
                                      when you see one of these.
 */
b.appendAll(a)
b
/*
def containsSlice[B](that:GenSeq[B]):Boolean  A GenSeq or Seq is a collection whose elements are arranged is sequential order.
                                      Think "Array,list,or string"
 */
b.containsSlice(a)
a.containsSlice(b)
