package com.testkotlin.shape

class Rectangle: Square() {
    val width: Int = 8;
    override fun drawSquare() {
        println("drawing rectangle" + width*length);
    }
    override val isSquare: Boolean
        get() {
            return  width == length
        }

}