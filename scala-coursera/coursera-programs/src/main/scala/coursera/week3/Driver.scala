package coursera.week3

object Driver {
  def main(args: Array[String]): Unit = {
    val rational1 = new Rational(1, 2)
    rational1.numer
    rational1.denom

    val rational2 = new Rational(2, 3)
    rational1.add(rational2)

    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(3, 2)

    // Impelementing x-y-z
    x.sub(y).sub(z)
    y.add(y)
    x.max(y)

  }
}