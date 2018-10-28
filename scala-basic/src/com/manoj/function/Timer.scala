// Functions are also objects in Scala.
// It is therefore possible to pass functions as arguments, to store them in variables,
// and to return them from other functions.
// This ability to manipulate functions as values is one of the cornerstone of a
// very interesting programming paradigm called functional programming.
object Timer {

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFiles)
    // Anonymous Functions or Lambdas
    oncePerSecond(() => println("Time Flies like an Arrow"))
  }

  def timeFiles() {
    println("Time Flies like an Arrow")
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

}
