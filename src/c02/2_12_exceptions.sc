import java.io.{IOException, InputStream}
import java.net.{MalformedURLException, URL}
//Scala has no "checked" exceptions---you never have to declare that a function or method might throw an exception
//A throw expression has the special type Nothing.That is useful in if/else expression is the type of the other branch.

def process(url: URL): Unit = {

}

val url = new URL("http://horstmann.com/fred-tiny.gif")
try {
	process(url)
} catch {
	case _: MalformedURLException => println(s"Bad URL:$url")
	case ex: IOException => ex.printStackTrace()
}
// As in Java or C++,the more general exception types should come after the
// more specific one
// Note that you can use _ for the variable name if you don't need it.

def process1(stream: InputStream):Unit = {

}

val in = new URL("http://horstmann.com/fred-tiny.gif").openStream()
try {
	process1(in)
}finally {
	in.close()
}
// The finally clause is executed whether or not the process function throws an exception.

// Scala does not have an analog to the Java try-with-resources statement.