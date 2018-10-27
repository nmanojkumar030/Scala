package com.manoj.blocks

object ConditionalBlock {
  def main(args: Array[String]): Unit = {
    val number_of_people = 10
    val donuts_per_person = 2
    val defaultDonutsToBuy = 8

    // if
    if (number_of_people >= 10) {
      println(s"Total number of donut required ${number_of_people * donuts_per_person}")
    }

    // if else
    if (number_of_people >= 10) {
      println(s"Total number of donut required ${number_of_people * donuts_per_person}")
    } else {
      println(s"Total number of donut required ${number_of_people}")
    }

    // if else if
    if (number_of_people > 10) {
      println(s"Number of donuts to buy = ${number_of_people * donuts_per_person}")
    } else if (number_of_people == 0) {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    } else {
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }

    // Using if and else clause as expression
    // In Java the same is done using Ternary operator
    val result = if (number_of_people >= 10) { println(s"Total number of donut required ${number_of_people * donuts_per_person}") } else println(s"Total number of donut required ${number_of_people}")
    println(result)
  }
}