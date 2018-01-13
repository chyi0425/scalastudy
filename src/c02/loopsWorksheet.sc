/*
Scala has no direct analog of the  for(initialize;test;update) loop.If you need such a loop, you have two choices.
You can use a while loop.Or, you can use a for statement like this:
for (i <- to n){
  r = r * i
}
The construct
for(i <- expr)
makes the variable i traverse all values of the expression to the right of the <-
 */
val s = "Hello"
var sum = 0
for (i <- 0 to s.length - 1)
  sum += s(i)
// In this example, there is actually no need to use indexes.You can directly loop over the characters:
sum = 0
for (ch <- "Hello") sum += ch
sum.toString
// Scala has no break or continue statements to break out of a loop. What to do if you need a break?
// Here are a few options:
// Use a Boolean control variable
// Use nested functions--you can return from the middle of a function.
// Use the break method in Breaks object:
/*
import scala.util.control.Breaks._
breakable{
  for(...){
    if(...) break; Exits the breakable block
  }
}
In Java you cannot have two local variables with the same name and overlapping scope.In Scala,there is no such prohibition,
and the normal shadwing rule applies.
val n = ...
for(n <- 1 to 10){
// Here n refers to the loop variable
}
 */