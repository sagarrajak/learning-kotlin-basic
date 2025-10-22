package com.testkotlin.function_example

fun String.lastChar(): Char = when {
    this.isEmpty() -> throw Exception("Empty String")
    else -> this[this.length -1]
}