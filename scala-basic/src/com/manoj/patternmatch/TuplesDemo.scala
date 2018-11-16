package com.manoj.patternmatch

object TuplesDemo {
  def main(args: Array[String]): Unit = {
    // Tuples with two elements
    val tuples1 = Tuple2("Hello", "World")
    println(tuples1)

    // Another way to create a Tuple
    val tuples2 = ("Manoj", "Kumar")
    println(tuples2)

    // Accessing tuples
    println(tuples2._1)
    println(tuples2._2)

    val tuple_list = List(tuples1, tuples2)
    tuple_list.foreach {
      tuple =>
        tuple match {
          case ("Hello", "World") => println("Its Hello World")
          case ("Manoj", "Kumar") => println("It's Manoj Kumar")
          case _                  => "Default "
        }
    }
  }
}