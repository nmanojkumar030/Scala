package com.manoj.variable

object MutableVariable {
  def main(args: Array[String]): Unit = {

    // var are mutable
    var z: Int = 1 +
      1
    // Can reassign the variable
    z = 3
    println(z)

    // lazy can be used only with val and not var
    // lazy var count: Int = 5

  }
}


