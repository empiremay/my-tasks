package Exercises.types

object classes {
  class Person(name: String, age: Int) {
    def summary: String = s"$name is $age years old"
  }
}
