package com.manoj.blocks

object Blocks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(121); 
  // Block {}, result of the last statement is the result of the block
  println({
    val a: Int = 2 + 2
    a + 4
  })}

}
