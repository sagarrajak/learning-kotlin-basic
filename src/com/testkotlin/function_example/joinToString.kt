package com.testkotlin.function_example

@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = " ",
    prefix: String = " ",
    suffix: String = "; "
): String {
    val result = StringBuilder(prefix);
    for ((index, value) in collection.withIndex()) {
        if (index > 0) result.append(separator);
        result.append(value);
    }
    result.append(suffix);
    return result.toString();
}

fun main() {
    var testSet = mutableSetOf("test", "test2")
    val joinToString = joinToString(testSet)
    println(joinToString)
    val lastChar = "Kotlin".lastChar()
    println("char: $lastChar")

}