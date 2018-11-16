package com.manoj

object PatternMatch {
  def main(args: Array[String]): Unit = {
    val num = 1
    num match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("Default") // Default case
    }

    println("*" * 100)

    // Match returning the value
    val result = num match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Default"
    }
    println(result)

    println("*" * 100)

    val result1 = num match {
      case 1 | 2 => "One OR Two" // Match two conditions
      case 3     => "Three"
      case _     => "Default"
    }
    println(result1)

    println("*" * 100)

    val input = 1
    val result2 = num match {
      case input if (input == 1 || input == 2) => "One OR Two" // Match two conditions
      case 3                                   => "Three"
      case _                                   => "Default"
    }
    println(result2)
    println("*" * 100)

    val priceOfDonut: Any = 2.5
    val result4 = priceOfDonut match {
      case priceOfDonut: Double  => "Double"
      case priceOfDonut: Int     => "Int"
      case priceOfDonut: Float   => "Float"
      case priceOfDonut: String  => "String"
      case priceOfDonut: Boolean => "Boolean"
      case priceOfDonut: Char    => "Char"
      case priceOfDonut: Long    => "Long"
    }

    println(result4)
  }
}