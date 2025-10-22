package com.testkotlin.lamda_example

import com.testkotlin.function_example.Person

class Basic {
}

fun main() {
    val pairExample = { x: Int, y: Int -> x to y}
    val myFavNumber = run {
        println("I'm thinking!")
        println("I'm doing some more work...")
        val x = 20;
        val y = 20;
        val z = 30;
        x + y
        z + x
    };
    println(myFavNumber);
    val people = listOf(
        Person("Alice", 29, "Something"), Person("Bob",
        31, "Something"))

    println(people.maxByOrNull { it -> it.age })
    println(people.minByOrNull { it.age })
    val person = people.maxByOrNull(){ it -> it.age };
    println(person);
    val personString = people.joinToString("  ", transform = { p -> p.name+"$"+p.city })
    println(personString)
    printMessage(people, "Test") {x -> x.name}
}

fun printProblemCount(response: Collection<String>): Pair<Int, Int> {
    var clientError = 0;
    var serverError = 0
    response.forEach {
        if (it.startsWith("4")) {
            clientError++;
        }
        else if(it.startsWith(prefix = "3")) {
            serverError++;
        }
    }
    return clientError to serverError
}

fun <T> printMessage(
    value: Collection<T>,
    prefix: String,
    converter: (T) -> String
) {
    value.forEach {
        println("${converter(it)} $prefix")
    }
    val responses = listOf("200 OK", "418 I'm a teapot",
        "500 Internal Server Error")
    val output= printProblemCount(responses)

}