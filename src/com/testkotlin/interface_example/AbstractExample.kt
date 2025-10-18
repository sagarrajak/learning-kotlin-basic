package com.testkotlin.interface_example

abstract class AbstractExample {
    abstract val animationSpeed: Double;
    val keyframes: Int = 20
    open val frames: Int = 60
    abstract fun animate();
    open fun stopAnimation() {
        println("stoping animation")
    }
    fun animateTwice() {}
}


