package file

import java.io.File

import scala.io.Source

class LimitedTextFile(path: String) {
  require(new File(path).exists())

  def lines: List[String] = {
    val lines = for (
      line <- Source.fromFile(path).getLines()
      if line.length > 10
    ) yield line

    lines.toList
  }
}
