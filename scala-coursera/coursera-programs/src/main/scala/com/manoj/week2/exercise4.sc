package com.manoj

object exercise {

  // Function currying
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    }
    return sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

  // To find the sum of numbers between a and b Ex: 1,2,3,4,5
  def sumInts2 = sum(x => x)                      //> sumInts2: => (Int, Int) => Int

  sumInts2(1, 5)                                  //> res0: Int = 15

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  def sumCubes2 = sum(x => x * x * x)             //> sumCubes2: => (Int, Int) => Int

  sumCubes2(1, 3)                                 //> res1: Int = 36

  // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial2 = sum(fact3)                  //> sumFactorial2: => (Int, Int) => Int

  def fact3(x: Int): Int = { if (x == 0) 1 else x * fact3(x - 1) }
                                                  //> fact3: (x: Int)Int

  sumFactorial2(1, 3)                             //> res2: Int = 9

}