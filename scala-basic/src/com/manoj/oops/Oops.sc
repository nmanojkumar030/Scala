package com.manoj.oops

object Oops {
  println("Welcome to the Scala worksheet")

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

  class User

  val user1 = new User

  println(user1)

}