package com.manoj.oops

/**
  * Class Person
  *
  * @param firstName
  * @param lastName
  */
class Person(firstName: String, lastName: String) {

  def display = println(s"Person First Name : $firstName and Last Name : $lastName")

  override def toString: String = s"Person First Name : $firstName and Last Name : $lastName"

}

/**
  * Companion Object
  *
  * The companion object should define an apply() method which will be
  * responsible for instantiating an instance of the given class.
  */
object Person {
  def apply(firstName: String, lastName: String): Person = {
    new Person(firstName, lastName)
  }

  def main(args: Array[String]): Unit = {
    // Instantiating through companion object doesn't require new keyword
    val person = Person("Manoj", "Kumar")
    //println(person)
    person.display

    // Instantiating through the new operator
    val person1 = new Person(firstName = "Poojashri", lastName = "C.S")
    person1.display
  }
}