/**
  * Classes in Scala are blueprints for creating objects.
  * They can contain
  *   1. methods
  *   2. values
  *   3. variables
  *   4. types
  *   5. objects
  *   6. traits and
  *   7. classes which are collectively called members.
  *
  * For more details visit : https://docs.scala-lang.org/tour/classes.html
  *
  * @param x
  * @param y
  */

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x,$y)"
}

/**
  * Constructor with default values or optional parameters
  *
  * @param x
  * @param y
  */

class Point1(var x: Int = 0, var y: Int = 0) {

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x,$y)"
}

/**
  * Private Getters and Setters
  */
class Point2 {
  private var x: Int = 0
  private var y: Int = 0

  private val bound: Int = 100

  /**
    * Getter
    *
    * @return
    */
  def a = x

  /**
    * Setter
    *
    * @param newValue
    * @return
    */
  def a_=(newValue: Int) = {
    if (newValue < bound)
      x = newValue
    else
      printWarningMsg
  }

  /**
    * Getter
    *
    * @return
    */
  def b = y

  /**
    * Setter
    *
    * @param newValue
    * @return
    */
  def b_=(newValue: Int) = {
    if (newValue < bound) {
      y = newValue
    } else
      printWarningMsg
  }

  private def printWarningMsg = "Warning: Out of Bounds"
}

/**
  *
  * @param x
  * @param y
  */
class Point3(val x: Int, val y: Int)

/**
  *
  * @param x
  * @param y
  */
class Point4(x: Int, y: Int)

object Main {
  def main(args: Array[String]): Unit = {
    val point1 = new Point(2, 6)
    println(point1)
    // x and y are public
    println(point1.x)
    // x and y are var - mutable
    println(point1.x = 5)
    println(point1.y = 7)

    // Constructor takes default values
    val point2 = new Point1()
    println(s"Point2: $point2")

    val point3 = new Point1(2)
    println(s"Point3: $point3")

    // Creating the object with the named parameters
    val point4 = new Point1(y = 5)
    println(point4)

    // Setters validation in action
    val point5 = new Point2
    println(point5.a = 120)

    val point6 = new Point3(2, 3)
    // point6.x = 8 -> Doesn't compile, it's val (Immutable)
    println(point6.x)

    val point7 = new Point4(2, 7)
    // point7.x -> does not compile - x and y are private
  }
}

