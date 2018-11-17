package com.manoj.blocks

object Blocks {
  println("Welcome to the Scala worksheet")
  // Block {}, result of the last statement is the result of the block
  println({
    val a: Int = 2 + 2
    a + 4
  })

}