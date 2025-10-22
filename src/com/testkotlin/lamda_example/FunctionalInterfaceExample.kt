package com.testkotlin.lamda_example

interface StringConsumer {
    fun consume(s: String);
}

class Test: StringConsumer {
    override fun consume(s: String) {
        TODO("Not yet implemented")
    }
}

fun consumerHello(con: StringConsumer) {
    con.consume("test")
}

fun consumerHello(con: ((v: String) -> Unit)) {
    con("String");
}

class FunctionalInterfaceExample {
}