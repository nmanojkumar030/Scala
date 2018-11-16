package com.manoj.variable

object Types {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet");$skip(34); 

  // Expression
  println(1 + 1);$skip(32); 
  println("Hello " + " World!");$skip(64); 

  // val are Immutable
  val x = 1 + 1;System.out.println("""x  : Int = """ + $show(x ));$skip(56);  // Local Type Inference
  println(x + 2);$skip(13);  // Original value of x is not changed.
  println(x);$skip(62); 

  val y: Int = 1 + 1;System.out.println("""y  : Int = """ + $show(y ));$skip(13);  // Type of variable could be mentioned.
  println(y);$skip(126); 

  // Doesn't compile
  // val -> Immutable, can't reassign once assign
  // x = 3

  // var are mutable
  var z: Int = 1 + 1;System.out.println("""z  : Int = """ + $show(z ));$skip(39); 
  // Can reassign the variable
  z = 3;$skip(13); 
  println(z)}

}
