package com.testkotlin.shape

open class Square {
    val length: Int = 12;
    open fun  drawSquare() {
        println("drawing square "+ length*length);
    }
    open val isSquare: Boolean
        get() {
            return true;
        }
}