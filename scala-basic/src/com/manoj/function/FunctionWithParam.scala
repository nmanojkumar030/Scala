package com.manoj.function

/**
 * In this tutorial, we will learn how to create functions that take parameters as input in Scala.
 * In addition, we will also see how you can assign default values to the parameters.
 *
 * Function with default values -> Java method overload
 */
object FunctionWithParam {
  def main(args: Array[String]): Unit = {
    val donutCost = calculateDonutCost("Glazed Donut", 100)
    println(donutCost)

    // Using Default value
    val donutCost1 = calculateDonutCost1("Plain Donut", 50, "DISC 50")
    println(donutCost1)

    val donutCost2 = calculateDonutCost1("Plain Donut", 50)
    println(donutCost1)

    // Using Option without default value
    val donutCost3 = calculateDonutCost2("Plain Donut", 50, None)
    println(donutCost3)

    val donutCost4 = calculateDonutCost2("Plain Donut", 50, Some("DISC 50"))
    println(donutCost4)

    // Using Option with default value
    val donutCost5 = calculateDonutCost3("Plain Donut", 50)
    println(donutCost5)

    val donutCost6 = calculateDonutCost3("Plain Donut", 50, Some("DISC 50"))
    println(donutCost6)
  }

  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating donut cost of $donutName and quantity $quantity")
    2.50 * quantity
  }

  /**
   * Usage of default values
   */
  def calculateDonutCost1(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    if (couponCode.equals("NO CODE")) {
      println(s"Calculating donut cost for $donutName and quantity $quantity")
    } else {
      println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
    }
    2.50 * quantity
  }

  /**
   * Usage of option
   */
  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: Option[String]): Double = {

    couponCode match {
      case Some(couponCode) =>
        println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
        2.50 * quantity * .9

      case None =>
        println(s"Calculating donut cost for $donutName and quantity $quantity")
        2.50 * quantity
    }

  }

  /**
   * Usage of option
   */
  def calculateDonutCost3(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {

    couponCode match {
      case Some(couponCode) =>
        println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
        2.50 * quantity * .9

      case _ =>
        println(s"Calculating donut cost for $donutName and quantity $quantity")
        2.50 * quantity
    }

  }
}