package com.manoj.week2

object example1 {

  def main(args: Array[String]): Unit = {
    println(sumInts(2, 5))
  }

  // Higher Order Function
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  // Without Anonymous Functions
  def sumInts(a: Int, b: Int): Int = sum(id, a, b)

  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)

  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)

  // With Anonymous Functions
  def sumInts2(a: Int, b: Int): Int = sum(x => x, a, b)

  def sumCubes2(a: Int, b: Int): Int = sum(x => x * x * x, a, b)

  def id(a: Int): Int = a

  def cube(a: Int): Int = a * a * a

  def fact(a: Int): Int =
    if (a == 0) 1 else a * fact(a - 1)

}