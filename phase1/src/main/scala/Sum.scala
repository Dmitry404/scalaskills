import java.util.function.Predicate

object Sum {
  private def calculate(numbers: List[Int])(p: Predicate[Int]): Int = {
    numbers.filter(p.test).sum
  }

  def odds(numbers: List[Int]): Int = calculate(numbers)(_ % 2 != 0)
}