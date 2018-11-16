package com.manoj.oops

object Oops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet")

  // Creating class in scala
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = {
      println(prefix + " " + name + suffix)
    }
  };$skip(257); 

  // Creating objects from class
  val greeter = new Greeter("Hello", suffix = "!");System.out.println("""greeter  : com.manoj.oops.Oops.Greeter = """ + $show(greeter ));$skip(25); 
  greeter.greet("Manoj")

  // Case class, here values are compared
  case class Point(x: Int, y: Int);$skip(166); 

  // Instantiate case class, here no new keyword is required
  val point = Point(1, 2);System.out.println("""point  : com.manoj.oops.Oops.Point = """ + $show(point ));$skip(33); 
  val anotherPoint = Point(1, 2);System.out.println("""anotherPoint  : com.manoj.oops.Oops.Point = """ + $show(anotherPoint ));$skip(36); 
  val yetAnotherPoint = Point(2, 3);System.out.println("""yetAnotherPoint  : com.manoj.oops.Oops.Point = """ + $show(yetAnotherPoint ));$skip(168); 

  if (point == anotherPoint) {
    println(point + " and " + anotherPoint + "are same ")
  } else {
    println(point + " and " + anotherPoint + "are different ")
  };$skip(198); 

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
  };$skip(235); 

  val newId: Int = IdFactory.create();System.out.println("""newId  : Int = """ + $show(newId ));$skip(17); 
  println(newId);$skip(41); 

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
  };$skip(544); 

  val defaultGreeter = new DefaultGreeter;System.out.println("""defaultGreeter  : com.manoj.oops.Oops.DefaultGreeter = """ + $show(defaultGreeter ));$skip(32); 
  defaultGreeter.greet("Manoj");$skip(63); 

  val customGreeter = new CustomizableGreeter("How are you?");System.out.println("""customGreeter  : com.manoj.oops.Oops.CustomizableGreeter = """ + $show(customGreeter ));$skip(31); 
  customGreeter.greet("Manoj");$skip(76); 

  // Everything is object
  // Numbers are object
  println(1 + 2 * 3 / 4);$skip(34); 
  println((1).+(((2).*(3)./(4))))

  class User;$skip(38); 

  val user1 = new User;System.out.println("""user1  : com.manoj.oops.Oops.User = """ + $show(user1 ));$skip(18); 

  println(user1)}

}
