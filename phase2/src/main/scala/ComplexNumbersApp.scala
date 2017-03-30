import numbers.Complex

object ComplexNumbersApp extends App {
  println(s"Complex number created with a real part: ${Complex(3.141)}")
  println(s"Complex number created with both real and imaginary parts: ${Complex(3.141, 2.718)}")
  println(s"Complex number which was made negative with unary -: ${-Complex(3.141, 2.718)}")
  println(s"Sum of two complex numbers: ${Complex(1.1, 2.7) + Complex(1.1, 2.1)}")
  println(s"Multiplication of two complex numbers: ${Complex(1.1, 2.7) * Complex(1.1, 2.1)}")
  println(s"Division of a complex number to a double value: ${Complex(1.4, 2.7) / 2}")
  println(s"Subtraction of double value from a complex number : ${Complex(1.4, 2.7) - 4}")
}
