import java.time.{LocalDate, Month}

import org.scalatest._

class PersonSpec extends FlatSpec with Matchers  {
  "A Person class" should "exist" in {
    val person = new Person("John Doe", LocalDate.of(1980, Month.JUNE, 10))

    person.getName should be ("John Doe")
    person.dob should be (LocalDate.of(1980, Month.JUNE, 10))
  }

  "A Person class" should "have a companion which calculates its age" in {
    val person = new Person("John Doe", LocalDate.of(1980, Month.OCTOBER, 10))

    Person.calculateAge(person) should be (36) // assuming it's March, 2017 now
  }

  "A main class" should "take persons data then print it to Out" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      PersonApp.main(Array[String]("John Doe", "10/01/1997"))
    }

    stream.toString should be ("Hi there, John Doe here. I'm alive for 20 years already")
  }
}