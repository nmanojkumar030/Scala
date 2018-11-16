package com.manoj.string

/**
  * 1. String once created cannot be changed
  * 2. When we operate on the string internally it creates a new string and returns that string
  */
object StringImmutability {

  def main(args: Array[String]): Unit = {
    val firstName = "Manoj"
    println(firstName.toUpperCase)
    // name still hasn't changed
    println(firstName)

   
    var lastName = "Kumar"
    lastName = lastName.toUpperCase
    // Now the lastname reference to the new string created ("KUMAR")
    println(lastName)
  }
}
