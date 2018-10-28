package com.manoj.loops

object ForLoop {
  def main(args: Array[String]): Unit = {
    // A simple for loop from 0 to 5 inclusive
    for (x <- 0 to 5) {
      println(x)
    }

    println("*" * 100)
    // A simple for loop from 0 to 5, 5 exclusive
    for (x <- 0 until 5) {
      println(x)
    }

    println("*" * 100)
    // A For loop with conditions
    for (x <- 0 to 100 if (x % 5 == 0)) {
      println(x)
    }

    println("*" * 100)
    // A For loop with yield
    val result = for {
      x <- 1 to 100
      if (x % 5 == 0)
    } yield x
    println(result)

    println("*" * 100)
    // A Nested For loop
    val result2 = for {
      x <- 1 to 5
      y <- 1 to 5
      z <- 1 to 5
    } yield (x, y, z)
    println(result2)

  }
}