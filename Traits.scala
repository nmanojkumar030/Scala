trait Iterator[A] {
  def hasNext(): Boolean

  def next(): A
}

class IntIterator(bound: Int) extends Iterator[Int] {

  private var current = 0

  override def hasNext(): Boolean = {
    current < bound
  }

  override def next(): Int = {
    if (hasNext()) {
      current += 1
      current
    } else 0
  }
}

object Traits {
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(10)
    println(iterator.next())
  }
}
