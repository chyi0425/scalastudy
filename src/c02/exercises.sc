import java.time.LocalDate

def singum(number: Int): Int = {
  if (number > 0) 1
  else if (number < -1) -1
  else 0
}
singum(-1233)

//2 value() Type :Unit

// 3 when x is a Unit type

def scalaprint(): Unit = {
  var i = 10
  while (i >= 0) {
    println(i)
    i -= 1
  }
}
scalaprint

def countdown(n: Int): Unit = {
  var i = n
  while (i >= 0) {
    println(i)
    i -= 1
  }
}
countdown(8)

def computunicodeproeduct(str: String): Unit = {
  var sum: BigInt = 1
  val length = str.length
  for (i <- 0 to length - 1) {
    sum = sum * str(i).toLong
  }
  print(sum)
}

computunicodeproeduct("Hello")

def execise7(str: String): BigInt = {
  var sum: BigInt = 0
  sum = str.map(_.toLong).product
  sum
}

def recusiveproduct(str: String, index: Int = 0): BigInt = {
  if (index == str.length - 1) {
    str(index).toLong
  } else {
    recusiveproduct(str, index + 1) * str(index).toLong
  }
}

recusiveproduct("Hello")

def execise10(x: Double, n: Int): BigDecimal = {
  if (n == 0) {
    1
  } else if (n < 0) {
    1 / execise10(x, -1 * n)
  } else if (n % 2 == 1) {
    x * execise10(x, n - 1)
  } else {
    execise10(x, n / 2) * execise10(x, n / 2)
  }
}

/*
implicit class DateInterpolator(val sc:StringContext)extends AnyVal{
  def date(args:Any*):LocalDate = {
    val strings=sc.parts.iterator
    val expressions=args.iterator

    LocalDate.of(year,month,int)
  }
}*/
