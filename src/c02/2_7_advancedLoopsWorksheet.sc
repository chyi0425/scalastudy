//You can have multiple generators of the form variable <- expression.Separate them by semicolons.
for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")
// Each generator can have a guard, a Boolean condition preceded by if:
for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")
// Note that there is no semicolon before the if.
//You can have any number of definitions,introducing variables that can be used inside the loop:
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")
// When the body of the for loop starts with yield,the loop constructs a collection of value.one for each iteration:
for (i <- 1 to 10) yield i % 3
// This type of loop is called a for comprehension.

// The generated collection is compatible with the first generator.
for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar // Yields "HIeflmlmop"
for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar // Yields ('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')
/*
If you prefer,you can enclose the generators,guards,and definitions of a for loop in braces,
and you can use newlines instead of semicolons to separate them;
 */
for {i <- 1 to 3
     from = 4 - i
     j <- from to 3
} print(f"${10 * i + j}%3d")