/**
  * All classes in Scala inherit from a super-class.
  * When no super-class is specified, as in the Complex scala.AnyRef is implicitly used.
  *
  * @param real
  * @param imaginary
  */
class Complex(real: Double, imaginary: Double) {
  /**
    * Getter
    *
    * @return
    */
  def realPart = real

  /**
    * Getter
    *
    * @return
    */
  def imaginaryPart = imaginary

  /**
    * Mandatory to explicitly specify that a method overrides another one using the override modifier,
    * in order to avoid accidental overriding.
    *
    * @return
    */
  override def toString = "" + real + (if (imaginary < 0) "-" else "+") + imaginary + "i"
}

object Complex {
  def main(args: Array[String]): Unit = {
    val complex = new Complex(2.5, 3.5)
    println(complex)
    println(complex.realPart)
    println(complex.imaginaryPart)
  }
}
