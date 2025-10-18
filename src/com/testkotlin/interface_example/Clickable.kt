package com.testkotlin.interface_example

interface Clickable {
    fun click()
    fun showOff() = println("I am clickable")
}

interface Actionable {
    fun onAction();
    fun showOff(t: Boolean) = println("I am actionable")
}

class Button: Clickable, Actionable {
    override fun click() {
        println("I was clicked")
    }

    override fun onAction() {
        println("on action implementation")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Actionable>.showOff(true)
    }
}

fun main() {
    val btn = Button()
    btn.showOff();
    btn.onAction()
    btn.click();
}