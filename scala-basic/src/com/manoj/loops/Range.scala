package com.manoj.loops

object Range {
  def main(args: Array[String]): Unit = {
      val result1 = 1 to 5
      // mkString -> String representation of each element in the  Collection
      println(result1.toList.mkString)
      
      val result2 = 1 until 5
      println(result2.toSet.mkString)
      
      val result3 = 1 until 10 by 2
      println(result3.toSeq.mkString)
      
      val result4 = 'a' to 'z'
      println(result4.toArray.mkString)
      
      val result5 = 'a' to 'z' by 2
      println(result5.toList.mkString)
      
      result5.foreach(println(_))
  }

}