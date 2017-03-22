import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Person (name: String, val dob: String) {
  def getName: String = name
}

object Person {
  def calculateAge(person: Person): Int = {
    val pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val dobDate = LocalDate.parse(person.dob, pattern)

    LocalDate.now.getYear - dobDate.getYear
  }
}
