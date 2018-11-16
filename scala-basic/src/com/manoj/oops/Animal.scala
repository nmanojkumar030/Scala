package com.manoj.oops


/**
  * Animal Class
  *
  * @param name
  */
class Animal(name: String) {
  def display: Unit = {
    println(s"Animal is $name with id ${Animal.id}")
  }
}

class Dog(name: String) extends Animal(name) {
  override def display: Unit = super.display
}

class Cat(name: String) extends Animal(name) {
  override def display: Unit = super.display
}

class Horse(name: String) extends Animal(name) {
  override def display: Unit = super.display
}

/**
  * Use Companion Objects' Apply Method As A Factory
  * (Class Hierarchy Via Inheritance)
  */
object Animal {

  private val id: Int = 1

  def apply(name: String): Animal = {
    name match {
      case "Dog" => new Dog(name)
      case "Cat" => new Cat(name)
      case _ => new Animal(name)
    }
  }

  def main(args: Array[String]): Unit = {
    // Instantiating Dog object
    val dog = Animal("Dog")
    dog.display

    // Instantiating Animal object
    val cat = Animal("Cat")
    cat.display

    val horse = Animal("Horse")
    horse.display
  }
}

