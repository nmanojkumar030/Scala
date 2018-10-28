package com.manoj.loops

object WhileLoop {
  def main(args: Array[String]): Unit = {

    // While Loop
    var x = 10
    while (x > 0) {
      println(x)
      x -= 1
    }

    println("*" * 100)
    var y = 0
    do {
      println(y)
      y += 1
    } while (y < 10)
  }
}