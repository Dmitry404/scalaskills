import java.time.{LocalDate, Month}

class PersonSpec extends UnitSpec  {
  "A Person class" should "exist" in {
    val person = new Person("John Doe", LocalDate.of(1980, Month.JUNE, 10))

    person.getName should be ("John Doe")
    person.dob should be (LocalDate.of(1980, Month.JUNE, 10))
  }

  it should "have a companion which calculates its age" in {
    val dob = LocalDate.of(1980, Month.DECEMBER, 31)

    Person("John Doe", dob).calculateAge() should be (36) // assuming it's not 31st December now
  }

  "A main class" should "take persons data then print it to Out" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      PersonApp.main(Array[String]("John Doe", "10/01/1997"))
    }

    stream.toString should be (s"Hi there, John Doe here. I'm alive for 20 years already${System.lineSeparator}")
  }

  "A main class with a trait" should "behave output the same that the PersonApp" in {
    val stream1 = new java.io.ByteArrayOutputStream()
    val stream2 = new java.io.ByteArrayOutputStream()
    val personData = Array[String]("Jane Roe", "10/10/2000")

    Console.withOut(stream1) {
      PersonTraitApp.main(personData)
    }
    Console.withOut(stream2) {
      PersonApp.main(personData)
    }

    stream1.toString shouldEqual stream2.toString
  }
}