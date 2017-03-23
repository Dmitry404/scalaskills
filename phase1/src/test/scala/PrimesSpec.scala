import org.scalatest._

class PrimesSpec extends FlatSpec with Matchers {
  "A Primes.contains result" should "be negative when empty List is passed" in {
    Primes.contains(List()) shouldBe false
  }

  "A Primes.contains result" should "be negative when 0 or 1 (definitely not prime numbers) are presented" in {
    Primes.contains(List(0, 1)) shouldBe false
  }

  "A Primes.contains result" should "be positive when at least one prime is presented" in {
    Primes.contains(List(1, 0, 4, 17, 6)) shouldBe true
  }

  "A Primes.contains result" should "be negative when no primes are presented" in {
    Primes.contains(List(1, 0, 4, 12)) shouldBe false
  }

  "A Prime.contains result" should "be positive when 2 is presented" in {
    Primes.contains(List(1, 2)) shouldBe true
  }
}
