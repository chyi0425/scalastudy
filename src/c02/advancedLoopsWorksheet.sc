//You can have multiple generators of the form variable <- expression.Separate them by semicolons.
 for(i <- 1 to 3;j <- 1 to 3) print(f"${10 * i + j}%3d")
// Each generator can have a guard, a Boolean condition