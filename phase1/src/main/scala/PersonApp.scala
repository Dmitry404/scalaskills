import java.time.format.DateTimeFormatter
import java.time.{LocalDate, Month}

object PersonApp {
  def main(args: Array[String]): Unit = {
    val datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val person = new Person(args(0), LocalDate.parse(args(1), datePattern))

    println(s"Hi there, ${person.getName} here. I'm alive for ${Person.calculateAge(person)} years already")
  }
}