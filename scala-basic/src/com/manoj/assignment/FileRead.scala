package com.manoj

import scala.io.Source
import java.text.SimpleDateFormat
import java.io.PrintWriter
import java.io.File

object FileRead {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:/data.txt")
    val writer = new PrintWriter(new File("Write.txt"))

    for (line <- source.getLines()) {
      println(line)
      val strings = line.split(",")

      val df = new SimpleDateFormat("yyyy-MM-dd")
      val date = df.format(strings.apply(1).toDouble)

      val output = strings.apply(0) + " " + date

      println(output)
      writer.write(output)
    }
    source.close()
    writer.close()
  }
}