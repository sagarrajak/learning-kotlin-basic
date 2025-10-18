package com.testkotlin.function_example

fun printNUmber(vararg numbers: Int) {
    println("Total numbers: ${numbers.size}")
    numbers.forEach { println("$it ") }
    println()
}

infix fun <A, B> A.fuckMe(other: B) = Pair(this, other)

fun main() {
    printNUmber(1,2,3,4,5,65)
    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")
    val test = map.fuckMe(mapOf(4 to "four"))
    println(test)

    val pair1 = Pair(listOf(1,2), listOf(3, 4))
    val pair2 = "Alice" to 30
    val pair3 = "Bob" to "ficler" to "something"
    println("${pair3.first.first} ${pair3.first.second} ${pair3.second}")

//    Inbuild infix fun3ction

}