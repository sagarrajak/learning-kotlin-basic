package com.testkotlin.lamda_example

import java.util.Date
import java.util.Timer
import java.util.TimerTask

fun main() {
    println("Scheduled task starting...")
    val timer = Timer()
    timer.schedule(object: TimerTask() {
        private var count = 0
        override fun run() {
            count++
            println("Timer task executed $count times at ${Date()}")
            if (count >= 5) {
                timer.cancel()
                println("Timer stopped")
            }
        }
    }, 0, 1000);
}