import org.scalatest._

import numbers.Complex

class ComplexNumberSpec extends FlatSpec with Matchers {
  "A string representation" should "be ${real} + ${imaginary}i" in {
    Complex(10, 2.2).toString shouldBe "10.0 + 2.2i"
  }

  it should "be ${real} + 0.0i when only real part is passed" in {
    Complex(10).toString shouldBe "10.0 + 0.0i"
  }

  it should "be -{real} + -{imaginary} when negative re and im" in {
    Complex(-3.1, -2).toString shouldBe "-3.1 + -2.0i"
  }

  it should "reduce numbers after decimal point to 1 place - rounded" in {
    Complex(3.142, 2.718).toString shouldBe "3.1 + 2.7i"
    Complex(1.66, 1.17).toString shouldBe "1.7 + 1.2i"
  }

  "Arithmetic operations" should "+ be a sum of two complex numbers" in {
    var c1 = Complex(1.1, 2.2)
    var c2 = Complex(3.3, 4.4)

    (c1 + c2).toString shouldBe "4.4 + 6.6i"
  }

  it should "- be a subtraction of two complex numbers" in {
    var c1 = Complex(1.1, 2.2)
    var c2 = Complex(3.3, 4.4)

    (c1 - c2).toString shouldBe "-2.2 + -2.2i"
  }

  it should "* be a multiplication of two complex numbers" in {
    var c1 = Complex(1, 2)
    var c2 = Complex(3, 4)

    (c1 * c2).toString shouldBe "3.0 + 8.0i"
  }

  it should "/ be a division of two complex numbers" in {
    var c1 = Complex(2, 2)
    var c2 = Complex(8, 4)

    (c1 / c2).toString shouldBe "0.3 + 0.5i"
  }

  it should "unary - should make Complex negative (both real and imaginary parts)" in {
    (-Complex(1.1, 2.2)).toString shouldBe "-1.1 + -2.2i"
  }

  "Arithmetic operations with numeric values" should "perform given operation with a Complex({num}, 0)" in {
    (Complex(1, 2) + 2).toString shouldBe "3.0 + 2.0i"
    (Complex(1, 2) - 2).toString shouldBe "-1.0 + 2.0i"
    (Complex(1, 2) * 2).toString shouldBe "2.0 + 2.0i"
    (Complex(1, 2) / 2).toString shouldBe "0.5 + 2.0i"
  }
}
