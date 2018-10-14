// Interoperability with Java
// Seamless integration with JAVA API

// Can extend Java class and Interface
import java.util.{ Date, Locale }
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val todayDate = new Date()
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    //println(dateFormat.format(todayDate))
    println(dateFormat format todayDate)
  }
}
