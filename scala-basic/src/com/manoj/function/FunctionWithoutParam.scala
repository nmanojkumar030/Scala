package com.manoj.function

object Function1 {
  def main(args: Array[String]): Unit = {
    val myfavouriteDonut = favouriteDonut1
    println(myfavouriteDonut)

    val leastFavDonut = leastFavouriteDonut
    println(leastFavDonut)

    val printSalesReport = printDonutSalesReport1
    println(printSalesReport)
  }

  /**
   * Scala function that takes no parameter but return a string
   */
  def favouriteDonut1(): String = {
    "Glazed Donut"
  }

  def favouriteDonut2: String = {
    "Glazed Donut"
  }

  /**
   * Function with no parenthesis
   */
  def leastFavouriteDonut = "Plain Donut"

  /**
   * A Function with no return type
   */
  def printDonutSalesReport1() = {

    println("Printing Sales Report...")

  }

  def printDonutSalesReport2 {

    println("Printing Sales Report...")

  }

}