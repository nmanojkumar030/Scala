import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet

class Dog(val name: String) extends Pet

object Traits2 {
  def main(args: Array[String]): Unit = {
    val pets = ArrayBuffer.empty[Pet]
    pets.append(new Cat("Cat"))
    pets.append(new Dog(name = "Dog"))

    for (pet <- pets) {
      println(pet.name)
    }
  }
}
