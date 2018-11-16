package com.manoj

/**
  * The class converts the time in the format hh:mm:ss to seconds
  */
object TimeInSecond {

  def main(args: Array[String]): Unit = {

    println("Enter the time in the format hh:mm:ss format:")
    //val time = "13:45:23"
    val time = scala.io.StdIn.readLine()
    val firstColon = time.indexOf(":")
    val secondColon = time.lastIndexOf(":")

    val hour = time.substring(0, firstColon) toInt
    val minutes = time.substring(firstColon + 1, secondColon) toInt
    val seconds = time.substring(secondColon + 1) toInt

    println(s"(Hour, Minutes, Seconds) ($hour, $minutes, $seconds)")

    val totalSeconds = hour * 3600 + minutes * 60 + seconds
    println(s"Total Seconds : $totalSeconds")
  }

}
