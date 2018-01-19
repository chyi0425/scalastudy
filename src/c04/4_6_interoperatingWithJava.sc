// If you get a Java map from calling a Java method,you may want to convert it to a Scala map
// so that you can use the pleasant Scala map API.This is also useful if you want to work
// with a mutable tree map,which Scala does't provied.
// Simply add an import statement:
import java.awt.Font
import java.util

// Then trigger the conversion by specifying the Scala map type:
import scala.collection.JavaConverters.mapAsScalaMap

val score: scala.collection.mutable.Map[String, Int] = mapAsScalaMap(new util.TreeMap[String, Int]())

// In addition,you can get a conversion from java.util.Properties to a Map[String,String]:
import scala.collection.JavaConverters.propertiesAsScalaMap

val props: scala.collection.Map[String, String] = propertiesAsScalaMap(System.getProperties())

import scala.collection.JavaConverters.mapAsJavaMap
import java.awt.font.TextAttribute._ // import keys for map below
val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
val font = new Font(mapAsJavaMap(attrs))