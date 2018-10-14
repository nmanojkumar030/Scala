// Expression
println(1 + 1)
println("Hello " + " World!")

// val are Immutable
val x = 1 + 1  // Local Type Inference 
println(x + 2) // Original value of x is not changed.
println(x)

val y: Int = 1 + 1 // Type of variable could be mentioned.
println(y)

// Doesn't compile
// val -> Immutable, can't reassign once assign
// x = 3

// var are mutable
var z: Int = 1 + 1
// Can reassign the variable
z = 3
println(z)

// Block {}, result of the last statement is the result of the block
println({
  val a: Int = 2 + 2
  a + 4
})

// Functions
// Anonymous functions or Lambdas
(x: Int) => x + 1

// Named functions
val addOne = (x: Int) => x + 1
println(addOne(1))

// Functions with multiple parameters
val add = (x: Int, y: Int) => x + y
println(add(2, 5))

// Functions with no parameter
val noparam = () => 25
println(noparam())

// Methods
def addMethod(x: Int, y: Int): Int = x + y
println(addMethod(3, 5))

// Methods can take multiple parameter list
def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z
println(addThenMultiply(2, 3)(5))

// Method with no parameter list
def name = System.getProperty("user.name")
println("Hello " + name)

// Methods with multiple lines
def getSquareString(x: Int): String = {
  (x * x).toString
}
println(getSquareString(5))

// Creating class in scala
class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit = {
    println(prefix + " " + name + suffix)
  }
}

// Creating objects from class
val greeter = new Greeter("Hello", suffix = "!")
greeter.greet("Manoj")

// Case class, here values are compared
case class Point(x: Int, y: Int)

// Instantiate case class, here no new keyword is required
val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val yetAnotherPoint = Point(2, 3)

if (point == anotherPoint) {
  println(point + " and " + anotherPoint + "are same ")
} else {
  println(point + " and " + anotherPoint + "are different ")
}

if (anotherPoint == yetAnotherPoint) {
  println(anotherPoint + " and " + yetAnotherPoint + "are same ")
} else {
  println(anotherPoint + " and " + yetAnotherPoint + "are different ")
}


// Objects, single instance of their definition
// Similar to singleton
object IdFactory {
  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}

val newId: Int = IdFactory.create()
println(newId)

val newerId: Int = IdFactory.create()
println(newerId)

// Main method
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")
  }
}

// Traits
// Contain certain fields and methods
trait GreetTrait {
  def greet(name: String): Unit
}

trait GreetTrait1 {
  def greet(name: String): Unit = println("Hello " + name)
}

class DefaultGreeter extends GreetTrait1

class CustomizableGreeter(prefix: String) extends GreetTrait1 {
  override def greet(name: String): Unit = println(prefix + name)
}

val defaultGreeter = new DefaultGreeter
defaultGreeter.greet("Manoj")

val customGreeter = new CustomizableGreeter("How are you?")
customGreeter.greet("Manoj")


// Everything is object
// Numbers are object
println(1 + 2 * 3 / 4)
println((1).+(((2).*(3)./(4))))


