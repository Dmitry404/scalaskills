import java.util.function.Predicate

import org.scalatest._

class SumSpec extends FlatSpec with Matchers {
  "Sum of 0" should "should be 0" in {
    Sum.odds(List(0)) shouldBe 0
  }

  "Sum of one odd number, when oddNums predicate given" should "be the number" in {
    Sum.odds(List(1)) shouldBe 1
  }

  "Sum of many odd numbers" should "be correct" in {
    Sum.odds(List(1, 3, 5)) shouldBe 1 + 3 + 5
  }

  "Sum of many odd numbers, in a list of mixed numbers" should "be correct" in {
    Sum.odds(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldBe 1 + 3 + 5 + 7 + 9
  }
}
