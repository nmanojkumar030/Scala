package com.manoj

object exercise {

  // Generic sum function handling sum of sequence, cubes , factorial
  // Higher order function - Takes function as arguements

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int

  // To find the sum of numbers between a and b Ex: 1,2,3,4,5
  def sumInts2(a: Int, b: Int): Int = sum(x => x, a, b)
                                                  //> sumInts2: (a: Int, b: Int)Int

  sumInts2(1, 5)                                  //> res0: Int = 15

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  def sumCubes2(a: Int, b: Int): Int = sum(x => x * x * x, a, b)
                                                  //> sumCubes2: (a: Int, b: Int)Int

  sumCubes2(1, 3)                                 //> res1: Int = 36

  // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial2(a: Int, b: Int): Int = sum(fact2, a, b)
                                                  //> sumFactorial2: (a: Int, b: Int)Int

  def fact2(x: Int): Int = { if (x == 0) 1 else x * fact2(x - 1) }
                                                  //> fact2: (x: Int)Int
  fact2(3)                                        //> res2: Int = 6

  sumFactorial2(1, 3)                             //> res3: Int = 9

	// Sum with tail optimzation recursion
  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc + f(a))
    }
    
    loop(a, 0)
  }                                               //> sum2: (f: Int => Int, a: Int, b: Int)Int
  
  sum2(x=> x, 1, 5)                               //> res4: Int = 15

}