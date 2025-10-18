package com.testkotlin.function_example

data class Person(var name: String, var age: Int, var city: String);
data class Coordinate(val x: Int, val y: Int, val z: Int)
fun personDetails(person: Person) {
    val (name,age, city) = person;
    println("$name $city $age");
}

fun main() {
    var person = Person(
        name = "test",
        age = 12,
        city = "TestCity"
    )
    var (name, age, city) = person;
    println("$name $age $city ${person.name}")
    val (x, _, z) = Coordinate(12, 20, 12)
    println("$x  $z")
    personDetails(person)
}


