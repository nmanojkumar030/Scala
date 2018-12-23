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
  sum(x => x)(1, 5)                               //> res0: Int = 15

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  sum(x => x * x * x)(1, 3)                       //> res1: Int = 36


 // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial2 = sum(fact4)                  //> sumFactorial2: => (Int, Int) => Int

  def fact4(x: Int): Int = { if (x == 0) 1 else x * fact4(x - 1) }
                                                  //> fact4: (x: Int)Int

  sumFactorial2(1, 3)                             //> res2: Int = 9

}