package com.manoj

import scala.collection.Seq

object HigherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(239); 
  // https://docs.scala-lang.org/tour/higher-order-functions.html

  // Passing function to a higher order function map.
  val salaries = Seq(2000, 5000, 7000);System.out.println("""salaries  : Seq[Int] = """ + $show(salaries ));$skip(40); 
  val double_salary = (x: Int) => x * 2;System.out.println("""double_salary  : Int => Int = """ + $show(double_salary ));$skip(30); val res$0 = 
  salaries.map(double_salary);System.out.println("""res0: Seq[Int] = """ + $show(res$0));$skip(34); val res$1 = 
  salaries.map((x: Int) => x * 2);System.out.println("""res1: Seq[Int] = """ + $show(res$1));$skip(22); val res$2 = 
  salaries.map(_ * 2);System.out.println("""res2: Seq[Int] = """ + $show(res$2));$skip(113); 

  // Passing method to a higher order function
  val temperatures = new WeaklyWeatherForecast(Seq(10, 20, 30));System.out.println("""temperatures  : com.manoj.WeaklyWeatherForecast = """ + $show(temperatures ));$skip(61); 
  val temp_in_fahrenheit = temperatures.forecastInFahrenheit;System.out.println("""temp_in_fahrenheit  : Seq[Double] = """ + $show(temp_in_fahrenheit ));$skip(257); 

  // Functions that return function
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  };System.out.println("""urlBuilder: (ssl: Boolean, domainName: String)(String, String) => String""");$skip(39); 

  val domainName = "www.example.com";System.out.println("""domainName  : String = """ + $show(domainName ));$skip(44); 
  val getURL = urlBuilder(true, domainName);System.out.println("""getURL  : (String, String) => String = """ + $show(getURL ));$skip(29); 
  
  val endPoint = "users";System.out.println("""endPoint  : String = """ + $show(endPoint ));$skip(22); 
  val query = "?id=1";System.out.println("""query  : String = """ + $show(query ));$skip(40); 
  
  val url = getURL(endPoint, query);System.out.println("""url  : String = """ + $show(url ))}
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
