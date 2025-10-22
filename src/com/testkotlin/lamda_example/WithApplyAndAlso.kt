package com.testkotlin.lamda_example


class WithApplyAndAlso {
}

fun main() {
    val builder = StringBuilder()
    with(builder) {
        for (i in 'A'..'Z') {
            this.append(i);
        }
        this.append("\n Fuck this shit")
    }
    println(builder.toString());
}