package com.testkotlin.function_example

import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get() = this.get(length-1)
    set(value) {
        this.setCharAt(length-1, value)
    }


fun main() {
    val builder = StringBuilder("Kotlin")
    println(builder.toString())
    builder.lastChar = '?'
    println(builder.toString())
}