package com.testkotlin.interface_example

open class RichButton: Clickable {
    override fun click() {}
    fun disabled() {}
    open fun animate() {}
}

class ThemedButton: RichButton() {
    override fun animate() {
        super.animate()
    }
    override fun click() {
        super.click()
    }
    override fun showOff() {
        super.showOff()
    }
}