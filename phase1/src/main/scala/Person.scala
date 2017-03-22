import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Person (name: String, val dob: LocalDate) {
  def getName: String = name
}

object Person {
  def calculateAge(person: Person): Long = {
    ChronoUnit.YEARS.between(person.dob, LocalDate.now) + 1
  }
}
