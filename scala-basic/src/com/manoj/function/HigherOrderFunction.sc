package com.manoj

import scala.collection.Seq

object HigherOrderFunction {
  // https://docs.scala-lang.org/tour/higher-order-functions.html

  // Passing function to a higher order function map.
  val salaries = Seq(2000, 5000, 7000)            //> salaries  : Seq[Int] = List(2000, 5000, 7000)
  val double_salary = (x: Int) => x * 2           //> double_salary  : Int => Int = com.manoj.HigherOrderFunction$$$Lambda$11/1349
                                                  //| 414238@96532d6
  salaries.map(double_salary)                     //> res0: Seq[Int] = List(4000, 10000, 14000)
  salaries.map((x: Int) => x * 2)                 //> res1: Seq[Int] = List(4000, 10000, 14000)
  salaries.map(_ * 2)                             //> res2: Seq[Int] = List(4000, 10000, 14000)

  // Passing method to a higher order function
  val temperatures = new WeaklyWeatherForecast(Seq(10, 20, 30))
                                                  //> temperatures  : com.manoj.WeaklyWeatherForecast = WeaklyWeatherForecast(List
                                                  //| (10.0, 20.0, 30.0))
  val temp_in_fahrenheit = temperatures.forecastInFahrenheit
                                                  //> temp_in_fahrenheit  : Seq[Double] = List(50.0, 68.0, 86.0)

  // Functions that return function
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }                                               //> urlBuilder: (ssl: Boolean, domainName: String)(String, String) => String

  val domainName = "www.example.com"              //> domainName  : String = www.example.com
  val getURL = urlBuilder(true, domainName)       //> getURL  : (String, String) => String = com.manoj.HigherOrderFunction$$$Lambd
                                                  //| a$16/940553268@668bc3d5
  
  val endPoint = "users"                          //> endPoint  : String = users
  val query = "?id=1"                             //> query  : String = ?id=1
  
  val url = getURL(endPoint, query)               //> url  : String = https://www.example.com/users??id=1
}

case class WeaklyWeatherForecast(temperatures: Seq[Double]) {

  private def convertCtoF(temp: Double):Double = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
}

object SalaryRaiser {

  def smallPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => salary * 1.1)
  def greatPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => math.log(salary))
  def hugePromotion(salaries: List[Double]): List[Double] = salaries.map(salary => salary * salary)

  def promotion(salaries: List[Double], promotion: Double => Double) = salaries.map(promotion)
}