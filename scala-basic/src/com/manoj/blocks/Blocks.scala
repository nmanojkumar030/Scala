package com.manoj.blocks

object Blocks {
  def main(args: Array[String]): Unit = {
    val result = {
      val x = 100
      println("Inside scope I", x);
      {
        val x = "ABC"
        println("Inside scope II", x)
        x
      }
    }

    // Block {}, result of the last statement is the result of the block
    println({
      val a: Int = 2 + 2
      a + 4
    })
  }
}
