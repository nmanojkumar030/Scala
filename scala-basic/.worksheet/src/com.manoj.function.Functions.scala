package com.manoj.function

object Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  println("Welcome to the Scala worksheet");$skip(123); 

  // Block {}, result of the last statement is the result of the block
  println({
    val a: Int = 2 + 2
    a + 4
  });$skip(73); val res$0 = 

  // Functions
  // Anonymous functions or Lambdas
  (x: Int) => x + 1;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(56); 

  // Named functions
  val addOne = (x: Int) => x + 1;System.out.println("""addOne  : Int => Int = """ + $show(addOne ));$skip(21); 
  println(addOne(1));$skip(80); 

  // Functions with multiple parameters
  val add = (x: Int, y: Int) => x + y;System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(21); 
  println(add(2, 5));$skip(60); 

  // Functions with no parameter
  val noparam = () => 25;System.out.println("""noparam  : () => Int = """ + $show(noparam ));$skip(21); 
  println(noparam());$skip(60); 

  // Methods
  def addMethod(x: Int, y: Int): Int = x + y;System.out.println("""addMethod: (x: Int, y: Int)Int""");$skip(27); 
  println(addMethod(3, 5));$skip(113); 

  // Methods can take multiple parameter list
  def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z;System.out.println("""addThenMultiply: (x: Int, y: Int)(z: Int)Int""");$skip(36); 
  println(addThenMultiply(2, 3)(5));$skip(82); 

  // Method with no parameter list
  def name = System.getProperty("user.name");System.out.println("""name: => String""");$skip(27); 
  println("Hello " + name);$skip(102); 

  // Methods with multiple lines
  def getSquareString(x: Int): String = {
    (x * x).toString
  };System.out.println("""getSquareString: (x: Int)String""");$skip(30); 
  println(getSquareString(5))

  // Creating class in scala
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = {
      println(prefix + " " + name + suffix)
    }
  };$skip(259); 

  // Creating objects from class
  val greeter = new Greeter("Hello", suffix = "!");System.out.println("""greeter  : com.manoj.function.Functions.Greeter = """ + $show(greeter ));$skip(25); 
  greeter.greet("Manoj")

  // Case class, here values are compared
  case class Point(x: Int, y: Int);$skip(168); 

  // Instantiate case class, here no new keyword is required
  val point = Point(1, 2);System.out.println("""point  : com.manoj.function.Functions.Point = """ + $show(point ));$skip(33); 
  val anotherPoint = Point(1, 2);System.out.println("""anotherPoint  : com.manoj.function.Functions.Point = """ + $show(anotherPoint ));$skip(36); 
  val yetAnotherPoint = Point(2, 3);System.out.println("""yetAnotherPoint  : com.manoj.function.Functions.Point = """ + $show(yetAnotherPoint ));$skip(169); 

  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + "are same ")
  } else {
    println(point + " and " + anotherPoint + "are different ")
  };$skip(199); 

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
  };$skip(238); 

  val newId: Int = IdFactory.create();System.out.println("""newId  : Int = """ + $show(newId ));$skip(17); 
  println(newId);$skip(42); 

  val newerId: Int = IdFactory.create();System.out.println("""newerId  : Int = """ + $show(newerId ));$skip(19); 
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
  };$skip(550); 

  val defaultGreeter = new DefaultGreeter;System.out.println("""defaultGreeter  : com.manoj.function.Functions.DefaultGreeter = """ + $show(defaultGreeter ));$skip(32); 
  defaultGreeter.greet("Manoj");$skip(64); 

  val customGreeter = new CustomizableGreeter("How are you?");System.out.println("""customGreeter  : com.manoj.function.Functions.CustomizableGreeter = """ + $show(customGreeter ));$skip(31); 
  customGreeter.greet("Manoj");$skip(77); 

  // Everything is object
  // Numbers are object
  println(1 + 2 * 3 / 4);$skip(34); 
  println((1).+(((2).*(3)./(4))))}

}
