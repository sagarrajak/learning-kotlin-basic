package com.testkotlin.lamda_example

interface SimpleButton {
    val label: String;
    fun  onClick() {
        println("simple button $label is clicked")
    }
}

class  TestButton(val label2: String) : SimpleButton {
    override var label: String = label2
        private set;

    override fun onClick() {
        super<SimpleButton>.onClick()
    }
}
fun simpleCompute(delay: Int, runnable: Runnable): Thread {
    return Thread {
        Thread.sleep(delay.toLong())
        println("Thread started!!")
        runnable.run()
        println("Thread completed!!")
    }
}

fun main() {
   val first =  simpleCompute(1000) {
        val fib = Array<Long>(1001) {0}
        fib[0] = 0
        fib[1] = 1
        for(i in 2..1000) {
            fib[i] = fib[i-1]+ fib[i-2]
        }
        println("value of i is "+fib[1000]);
    }

    val second = simpleCompute(1000, object: Runnable {
        override fun run() {
            for (i in 1..100) {
                Thread.sleep(10)
                println("${i+1}  times")
            }
            println("This is something is new")
        }
    })
   first.start()
    second.start()
    first.join()
    second.join()
}

