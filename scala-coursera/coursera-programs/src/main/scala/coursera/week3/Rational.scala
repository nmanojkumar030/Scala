package coursera.week3

/**
 * Rational Class
 */
class Rational(x: Int, y: Int) { // This line also acts as a constructor, in fact it's a primary constructor

  // Another constructor taking just a single argument
  def this(x: Int) = this(x, 1);

  require(y != 0, "Denominator should not be zero")

  /**
   * GCD of two numbers
   */
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g: Int = gcd(x, y);

  /**
   * Getter Method for x
   */
  def numer = x / g

  /**
   * Getter Method for y
   */
  def denom = y / g
  /**
   * Rational Addition
   */
  def add(that: Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, that.denom * denom); // No explicit return
  }

  /**
   * Negation of Rational Number
   */
  def neg: Rational = new Rational(-numer, denom)

  /**
   * Rational Subtraction
   */
  def sub(that: Rational): Rational = {
    // new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
    // Another way of adding the Rational. DRY(Don't repeat yourself) in action (reusing the add method)
    add(that.neg);
  }

  /**
   * Rational Less Function
   */
  def less(that: Rational): Boolean = numer * that.denom < denom * that.numer

  /**
   * Rational Max
   */
  def max(that: Rational) = if (this.less(that)) that else this

  /**
   * String representation of Rational
   */
  override def toString() = numer + "/" + denom

}