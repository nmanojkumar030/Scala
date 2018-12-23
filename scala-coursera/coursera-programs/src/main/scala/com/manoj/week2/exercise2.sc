package com.manoj

object exercise {
  println("Sum of numbers with higher order functions")

  // Generic sum function handling sum of sequence, cubes , factorial
  // Higher order function - Takes function as arguements

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }

  // To find the sum of numbers between a and b Ex: 1,2,3,4,5
  def sumInts2(a: Int, b: Int): Int = sum(id, a, b)

  def id(x: Int): Int = x

  sumInts2(1, 5)

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  def sumCubes2(a: Int, b: Int): Int = sum(cube, a, b)

  def cube2(x: Int): Int = x * x * x

  sumCubes2(1, 3)

  // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial2(a: Int, b: Int): Int = sum(fact, a, b)

  def fact2(x: Int): Int = { if (x == 0) 1 else x * fact2(x - 1) }
  fact2(3)

  sumFactorial2(1, 3)

}