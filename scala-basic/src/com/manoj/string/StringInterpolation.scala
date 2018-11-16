package com.manoj.string

/**
  * String Interpolation
  */
object StringInterpolation {
  def main(agrs: Array[String]): Unit = {

    val name = "Manoj Kumar"
    val age = 31.0

    //1. String interpolation using String Concatenation
    println("I am " + name + " and " + " my age is " + age)

    // 2. Using String interpolation to print a variable.
    // We've prefixed the s at the beginning of our println statement.
    // We also used the dollar sign $ to refer to our variable.
    println(s"I am $name and my age is $age")

    //3. Using String interpolation on object properties
    val person: Person = Person("Manoj", "Kumar")
    println(s"My FirstName : ${person.fname} and LastName : ${person.lname}")

    //4. String interpolation to evaluate expressions
    // String interpolation with expressions by using the curly braces.
    println(s"My age of after 5 years = ${age + 5}")

    //5. String Interpolation with formatter
    println(f"I am $name and my age is $age%.2f")

    //6. raw string
    println(raw"Hello \n World")

    // Without raw Hello and Word will be printed in 2 lines
    println("Hello \n World")


    // Escape JSON String
    // Option 1 - Using backslash
    val escape: String = "{\"FirstName\":\"Manoj\", \"LastName\":\"Kumar\"}"
    println(escape)

    // Option 2 - Using triple quotes """ to escape characters
    val escape1: String =
      """{"FirstName":"Manoj", "LastName":"Kumar"}"""
    println(escape1)

    val escape2: String =
      """
        |{
        |"FirstName":"Manoj",
        |"LastName":"Kumar"
        |}""".stripMargin
    println(escape2)

  }

}

case class Person(fname: String, lname: String)



