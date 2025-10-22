package com.testkotlin.lamda_example

import java.awt.Label

fun main() {
    var onClick = 0;
    val button = Button("test") {
        onClick++;
        println("button clicked")
    }
    button.click()
    button.click()
    button.click()
    println(onClick)
    run(::salute)
    val createPerson = ::Person2;
    val person = createPerson("sagar", 32)
    println(person)
    println(person.isAdult())
}

fun createNumberGenerator(): () -> Int {
    var current = 0;
    return {
        val result = current;
        current++;
        result
    }
}
fun salute() = println("Salute!")

class Button(
    var label:  String,
    var isFocusable: Boolean = true,
    var isClickable: Boolean = true,
    val onClikLister: (() -> Unit)? = null
) {
    private var onClickListener: (() -> Unit)? = onClikLister;
    fun click() {
        onClickListener?.invoke();
    }
}

data class Person2(val name: String, val age: Int)

fun Person2.isAdult(): Boolean  {
    return age > 32
}