package com.manoj.variable

object ImmutableVariable {
  def main(args: Array[String]): Unit = {

    // val are Immutable
    val x = 1 + 1 // Local Type Inference, x inferred as Int
    println(x + 2) // Original value of x is not changed.
    println(x) // Value of x is still 2

    val y: Int = 1 + 1 // Type of variable could be mentioned.
    println(y)

    // Doesn't compile
    // val -> Immutable, can't reassign once assign
    // y = 3

    // lazy can be used only with val and not var
    lazy val count: Int = 5 // Initialized only when used
    print(count)

  }

  // Initializing with the default value.
  var z: String = _
  z = "Hello"
}


