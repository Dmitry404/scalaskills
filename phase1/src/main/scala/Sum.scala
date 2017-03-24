import java.util.function.Predicate

object Sum {
  private def calculate(numbers: List[Int])(p: Predicate[Int]): Int = {
    numbers.filter(p.test).sum
  }

  def odds(numbers: List[Int]): Int = calculate(numbers)(_ % 2 != 0)

  def main(args: Array[String]): Unit = {
    println(s"Given input has the following sum of odd numbers: ${odds(args.map(_.toInt).toList)}")
  }
}