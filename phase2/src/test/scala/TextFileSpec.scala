import java.io.File

import org.scalatest._

import scala.io.Source

class TextFileSpec extends FlatSpec with Matchers {
  "LimitedTextFile.lines" should "contain only lines with length more than 10" in {
    new LimitedTextFile("phase2/src/test/resources/lines.txt").lines should have size 4
  }

  the [IllegalArgumentException] thrownBy {
    new LimitedTextFile("ababagalamaga")
  } should have message "requirement failed"

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
}
