package com.testkotlin.visibilityExample


//STATIC/NESTED CLASS (No outer reference)
class InnerClass {
    companion object {
        private const val staticField: String = "testValue"
    }

    private val instanceField = "instance";

    class Nested {
        fun printValue() {
            println(staticField)
        }
    }
}

// INNER CLASS (With outer reference)
class Outer {
    private val outerRef: String = "OuterRef";
    inner class Inner {
        fun print() {
            println(outerRef);
            println(this@Outer)
        }
    }
}

fun main() {
    val nested = InnerClass()
    val outer = Outer()
    val inner = outer.Inner()
    val nested1 = InnerClass.Nested()
    println(nested1.printValue())
}