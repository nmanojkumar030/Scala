package com.manoj.variable

object Types {
  println("Welcome to the Scala worksheet")

  // Expression
  println(1 + 1)
  println("Hello " + " World!")

  // val are Immutable
  val x = 1 + 1 // Local Type Inference
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

}