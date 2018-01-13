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
