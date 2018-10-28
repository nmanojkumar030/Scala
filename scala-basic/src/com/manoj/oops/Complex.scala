// All classes in Scala inherit from a super-class.
// When no super-class is specified, as in the Complex example of previous section, scala.AnyRef is implicitly used.
class Complex(real: Double, imaginary: Double) {
  def re() = real

  def img() = imaginary

  // mandatory to explicitly specify that a method overrides another one using the override modifier,
  // in order to avoid accidental overriding.
  override def toString = "" + real + (if (imaginary < 0) "-" else "+") + imaginary + "i"
}

object Complex {
  def main(args: Array[String]): Unit = {
    val complex1 = new Complex(2.5, 3.5)
    println(complex1)
    println(complex1.re)
    println(complex1.img)
  }
}
