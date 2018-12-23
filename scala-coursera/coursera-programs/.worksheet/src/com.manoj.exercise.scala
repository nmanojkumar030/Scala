package com.manoj

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 

  // Function currying
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    }
    return sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(84); val res$0 = 

  // To find the sum of numbers between a and b Ex: 1,2,3,4,5
  sum(x => x)(1, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(96); val res$1 = 

  // To find the sum of numbers between a and b Ex: 1,8,27,64,125
  sum(x => x * x * x)(1, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(92); 


 // To find the sum of numbers between a and b Ex: 1,2,6
  def sumFactorial2 = sum(fact4);System.out.println("""sumFactorial2: => (Int, Int) => Int""");$skip(68); 

  def fact4(x: Int): Int = { if (x == 0) 1 else x * fact4(x - 1) };System.out.println("""fact4: (x: Int)Int""");$skip(23); val res$2 = 

  sumFactorial2(1, 3);System.out.println("""res2: Int = """ + $show(res$2))}

}
