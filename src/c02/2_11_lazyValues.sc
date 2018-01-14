//When a val is declared sa lazy,its initialization is deferred until it is accessed for the first time.
lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
//If the program never accesses words,the file is never opened.
//Lazy values are useful to delay costly initialization statements.