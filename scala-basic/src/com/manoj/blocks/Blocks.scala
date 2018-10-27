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
  }
}
