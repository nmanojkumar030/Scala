object String_Interpolation {
  def main(agrs: Array[String]): Unit = {

    val name = "Manoj Kumar"
    val age = 31.0
    val string = "I am " + name + " and " + " my age is " + age
    println(string)

    // S interpolator
    println(s"I am $name and my age is $age")

    // f interpolator - String formatter
    println(f"I am $name and my age is $age%.2f")

    // raw string
    println(raw"Hello \n World")
    println("Hello \n World") // Without raw Hello and Word will be printed in 2 lines
  }
}