class HelloWormSpec extends UnitSpec {
  "A main method" should "output 'Hello Worm' greeting and a new line" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      HelloWormApp.main(Array[String]())
    }

    stream.toString shouldEqual s"Hello Worm${System.lineSeparator}"
  }
}