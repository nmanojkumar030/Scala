// https://docs.scala-lang.org/tour/unified-types.html

object Unified_Types {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List("a string", 732, 'c', true, () => "an anonymous function returning string")
    list.foreach(element => println(element))

    // Type Casting
    val x: Long = 987654321
    val y: Float = x
    println(x)
    println(y)

    val face: Char = '@'
    val number: Int = face
    println(number)
  }
}