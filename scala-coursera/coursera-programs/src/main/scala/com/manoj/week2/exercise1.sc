package com.manoj

object exercise {
  println("Sum of numbers without higher order functions")
                                                  //> Sum of numbers without higher order functions

  // To find the sum of numbers between a and b, 1,2,3,4,5
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else a + sumInts(a + 1, b)
  }                                               //> sumInts: (a: Int, b: Int)Int
  sumInts(1, 5)                                   //> res0: Int = 15

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
  }                                               //> sumCubes: (a: Int, b: Int)Int
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  sumCubes(1, 3)                                  //> res1: Int = 36

  // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial(a: Int, b: Int): Int = {
    if (a > b) 0 else fact(a) + sumFactorial(a + 1, b)
  }                                               //> sumFactorial: (a: Int, b: Int)Int
  def fact(x: Int): Int = { if (x == 0) 1 else x * fact(x - 1) }
                                                  //> fact: (x: Int)Int
  fact(3)                                         //> res2: Int = 6
  sumFactorial(1, 3)                              //> res3: Int = 9

}