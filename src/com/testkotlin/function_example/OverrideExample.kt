package com.testkotlin.function_example

open class View {
    open fun click() = println("View clicked");
}

class Button(): View() {
    override fun click() {
        println("Button clicked");
    }
}

fun main() {
    val view: View = Button();
    val view2 = View()
    view.click();
    view2.click();
}