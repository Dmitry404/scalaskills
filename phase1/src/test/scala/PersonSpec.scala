import org.scalatest._

class PersonSpec extends FlatSpec with Matchers  {
  "A Person class" should "exist" in {
    val person = new Person("John Doe", "10/10/1980")

    person.getName should be ("John Doe")
    person.dob should be ("10/10/1980")
  }

  "A Person class" should "have a companion which calculates its age" in {
    val person = new Person("John Doe", "10/10/1980")

    Person.calculateAge(person) should be (37) // assuming it's 2017 now
  }
}