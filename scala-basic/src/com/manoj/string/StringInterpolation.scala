package com.manoj.string

object StringInterpolation {
  def main(agrs: Array[String]): Unit = {

    val name = "Manoj Kumar"
    val age = 31.0
    val string = "I am " + name + " and " + " my age is " + age
    println(string)

    // 1. Using String interpolation to print a variable.
    //    We've prefixed the s at the beginning of our println statement.
    //    We also used the dollar sign $ to refer to our variable.

    //S Interpolation
    println(s"I am $name and my age is $age")

    //2. Using String interpolation on object properties
    val person: Person = Person("Manoj", "Kumar")
    println(s"My FirstName : ${person.fname} and LastName : ${person.lname}")

    //3. Using String interpolation to evaluate expressions
    // String interpolation with expressions by using the curly braces.
    println(s"My age of after 5 years = ${age + 5}")

    // f Interpolation - String formatter
    println(f"I am $name and my age is $age%.2f")

    // raw string
    println(raw"Hello \n World")
    println("Hello \n World") // Without raw Hello and Word will be printed in 2 lines

  }

}

case class Person(fname: String, lname: String)



