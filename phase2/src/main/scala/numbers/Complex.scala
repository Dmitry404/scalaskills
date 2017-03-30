package numbers

class Complex(val re: Double, val im: Double) {
  def this(re: Double) = this(re, 0)

  override def toString: String = f"$re%2.1f + $im%2.1fi"

  def +(that: Complex) = new Complex(re + that.re, im + that.im)
  def -(that: Complex) = new Complex(re - that.re, im - that.im)
  def *(that: Complex) = new Complex(re * that.re, im * that.im)
  def /(that: Complex) = new Complex(re / that.re, im / that.im)

  def +(value: Double) = new Complex(re + value, im)
  def -(value: Double) = new Complex(re - value, im)
  def *(value: Double) = new Complex(re * value, im)
  def /(value: Double) = new Complex(re / value, im)

  def unary_-() = new Complex(-re, -im)
}

object Complex {
  def apply(re: Double, im: Double) = new Complex(re, im)
  def apply(re: Double) = new Complex(re, 0.0)
}
