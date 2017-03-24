object Primes {
  def contains(numbers: List[Int]): Boolean = {
    numbers.exists(num => {
      num > 1 && !2.to(Math.sqrt(num).toInt).exists(num % _ == 0)
    })
  }

  def main(args: Array[String]): Unit = {
    println(s"Given input contains prime numbers: ${contains(args.map(n => n.toInt).toList)}")
  }
}