import org.scalatest._

class ComplexNumberSpec extends FlatSpec with Matchers {
  "A string representation" should "be ${real} + ${imaginary}i" in {
    new Complex(10, 2.2).toString shouldBe "10.0 + 2.2i"
  }

  it should "be ${real} + 0.0i when only real part is passed" in {
    new Complex(10).toString shouldBe "10.0 + 0.0i"
  }

  it should "be -{real} + -{imaginary} when negative re and im" in {
    new Complex(-3.1, -2).toString shouldBe "-3.1 + -2.0i"
  }

  it should "reduce numbers after decimal point to 1 place - rounded" in {
    new Complex(3.142, 2.718).toString shouldBe "3.1 + 2.7i"
    new Complex(1.66, 1.17).toString shouldBe "1.7 + 1.2i"
  }

  "Arithmetic operations" should "+ be a sum of two complex numbers" in {
    var c1 = new Complex(1.1, 2.2)
    var c2 = new Complex(3.3, 4.4)

    (c1 + c2).toString shouldBe "4.4 + 6.6i"
  }

  it should "- be a substraction of two complex numbers" in {
    var c1 = new Complex(1.1, 2.2)
    var c2 = new Complex(3.3, 4.4)

    (c1 - c2).toString shouldBe "-2.2 + -2.2i"
  }

  it should "* be a multiplication of two complex numbers" in {
    var c1 = new Complex(1, 2)
    var c2 = new Complex(3, 4)

    (c1 * c2).toString shouldBe "3.0 + 8.0i"
  }

  it should "/ be a division of two complex numbers" in {
    var c1 = new Complex(2, 2)
    var c2 = new Complex(8, 4)

    (c1 / c2).toString shouldBe "0.3 + 0.5i"
  }

  "Arithmetic operations with numerics" should "+ be a sum of given complex number and {num} + 0.0i" in {

  }


  class Complex(val re: Double, val im: Double) {
    def this(re: Double) = this(re, 0)

    override def toString: String = f"$re%2.1f + $im%2.1fi"

    def +(that: Complex) = new Complex(re + that.re, im + that.im)
    def -(that: Complex) = new Complex(re - that.re, im - that.im)
    def *(that: Complex) = new Complex(re * that.re, im * that.im)
    def /(that: Complex) = new Complex(re / that.re, im / that.im)
  }

}
