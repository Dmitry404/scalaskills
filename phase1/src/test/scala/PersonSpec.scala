import org.scalatest._

class PersonSpec extends FlatSpec with Matchers  {
  "A Person class" should "exist" in {
    val person = new Person("John Doe", "10/10/80")

    person.getName should be ("John Doe")
    person.dob should be ("10/10/80")
  }
}