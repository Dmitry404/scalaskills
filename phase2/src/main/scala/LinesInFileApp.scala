import file.LimitedTextFile

object LinesInFileApp extends App {
  if (args.length > 0) {
    try {
      val lines = new LimitedTextFile(args(0)).lines
      println(s"${lines.size} lines with a length bigger than 10 found in ${args(0)}")
      lines.foreach(println(_))
    } catch {
      case ex: IllegalArgumentException => println("the first parameter should be a valid path to file")
    }
  } else println("no file specified")
}
