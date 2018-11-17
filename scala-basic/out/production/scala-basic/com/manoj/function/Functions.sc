package com.manoj.function

object Functions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Block {}, result of the last statement is the result of the block
  println({
    val a: Int = 2 + 2
    a + 4
  })                                              //> 8

  // Functions
  // Anonymous functions or Lambdas
  (x: Int) => x + 1                               //> res0: Int => Int = com.manoj.function.Functions$$$Lambda$8/312116338@27f674d
                                                  //| 

  // Named functions
  val addOne = (x: Int) => x + 1                  //> addOne  : Int => Int = com.manoj.function.Functions$$$Lambda$9/488970385@481
                                                  //| 40564
  println(addOne(1))                              //> 2

  // Functions with multiple parameters
  val add = (x: Int, y: Int) => x + y             //> add  : (Int, Int) => Int = com.manoj.function.Functions$$$Lambda$10/11347129
                                                  //| 04@3ac3fd8b
  println(add(2, 5))                              //> 7

  // Functions with no parameter
  val noparam = () => 25                          //> noparam  : () => Int = com.manoj.function.Functions$$$Lambda$11/1854778591@7
                                                  //| a79be86
  println(noparam())                              //> 25

  // Methods
  def addMethod(x: Int, y: Int): Int = x + y      //> addMethod: (x: Int, y: Int)Int
  println(addMethod(3, 5))                        //> 8

  // Methods can take multiple parameter list
  def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z
                                                  //> addThenMultiply: (x: Int, y: Int)(z: Int)Int
  println(addThenMultiply(2, 3)(5))               //> 25

  // Method with no parameter list
  def name = System.getProperty("user.name")      //> name: => String
  println("Hello " + name)                        //> Hello mnanjundegowda

  // Methods with multiple lines
  def getSquareString(x: Int): String = {
    (x * x).toString
  }                                               //> getSquareString: (x: Int)String
  println(getSquareString(5))                     //> 25

  // Creating class in scala
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = {
      println(prefix + " " + name + suffix)
    }
  }

  // Creating objects from class
  val greeter = new Greeter("Hello", suffix = "!")//> greeter  : com.manoj.function.Functions.Greeter = com.manoj.function.Functi
                                                  //| ons$Greeter$1@34ce8af7
  greeter.greet("Manoj")                          //> Hello Manoj!

  // Case class, here values are compared
  case class Point(x: Int, y: Int)

  // Instantiate case class, here no new keyword is required
  val point = Point(1, 2)                         //> point  : com.manoj.function.Functions.Point = Point(1,2)
  val anotherPoint = Point(1, 2)                  //> anotherPoint  : com.manoj.function.Functions.Point = Point(1,2)
  val yetAnotherPoint = Point(2, 3)               //> yetAnotherPoint  : com.manoj.function.Functions.Point = Point(2,3)

  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + "are same ")
  } else {
    println(point + " and " + anotherPoint + "are different ")
  }                                               //> Point(1,2) and Point(1,2)are same 

  if (anotherPoint == yetAnotherPoint) {
    println(anotherPoint + " and " + yetAnotherPoint + "are same ")
  } else {
    println(anotherPoint + " and " + yetAnotherPoint + "are different ")
  }                                               //> Point(1,2) and Point(2,3)are different 

  // Objects, single instance of their definition
  // Similar to singleton
  object IdFactory {
    private var counter = 0

    def create(): Int = {
      counter += 1
      counter
    }
  }

  val newId: Int = IdFactory.create()             //> newId  : Int = 1
  println(newId)                                  //> 1

  val newerId: Int = IdFactory.create()           //> newerId  : Int = 2
  println(newerId)                                //> 2

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

  val defaultGreeter = new DefaultGreeter         //> defaultGreeter  : com.manoj.function.Functions.DefaultGreeter = com.manoj.f
                                                  //| unction.Functions$DefaultGreeter$1@506e6d5e
  defaultGreeter.greet("Manoj")                   //> Hello Manoj

  val customGreeter = new CustomizableGreeter("How are you?")
                                                  //> customGreeter  : com.manoj.function.Functions.CustomizableGreeter = com.man
                                                  //| oj.function.Functions$CustomizableGreeter$1@96532d6
  customGreeter.greet("Manoj")                    //> How are you?Manoj

  // Everything is object
  // Numbers are object
  println(1 + 2 * 3 / 4)                          //> 2
  println((1).+(((2).*(3)./(4))))                 //> 2

}