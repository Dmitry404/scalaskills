import org.scalatest._

import file.LimitedTextFile

class TextFileSpec extends FlatSpec with Matchers {
  "LimitedTextFile.lines" should "contain only lines with length more than 10" in {
    new LimitedTextFile("phase2/src/test/resources/lines.txt").lines should have size 4
  }

  the [IllegalArgumentException] thrownBy {
    new LimitedTextFile("ababagalamaga")
  } should have message "requirement failed"
}
