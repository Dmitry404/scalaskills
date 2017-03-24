import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Person (private val name: String, val dob: LocalDate) {
  def getName: String = name

  def calculateAge(): Long = {
    ChronoUnit.YEARS.between(dob, LocalDate.now)
  }
}

object Person {
  def apply(name: String, dob: LocalDate): Person = new Person(name, dob)
}
