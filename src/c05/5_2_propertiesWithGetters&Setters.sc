// When writing a Java class,we don't like to use public fields.
//With a public field,anyone could write to fred.age,making Fred younger or older.
// That's why we prefer to use getter and setter methods.

// A getter/setter pair such as this one is often called a property.
// Getters and setters are better than public fields because
// they let you start with simple get/set semantics and evolve them as needed
// Just because getters and setters are better than public fields doesn't mean they are always good.Often,it is plainly
// bad if every client can get or set bits and pieces of an object's state.In this section,I show you how to implement
// properties in Scala.It is up to you to choose wisely when a gettable/settable property is an appropriate design.

// Scala provides getter and setter methods for every field.Here,we define a public field