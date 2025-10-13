package com.testkotlin.enum_example.statemachine

enum class State { IDLE, SHOW_MENU, ITEM_SELECTED, DISPENSING, ERROR }
enum class Input { COIN, CHOOSE_DRINK, DISPENSE, CANCEL }
data class Transition(val current: State, val input: Input)

fun nextState(current: State, input: Input): State = when(Transition(current, input)) {
    Transition(State.IDLE, Input.COIN) -> State.SHOW_MENU
    Transition( current = State.SHOW_MENU, Input.CHOOSE_DRINK) -> State.ITEM_SELECTED
    Transition( current = State.SHOW_MENU, Input.CANCEL ) -> State.IDLE
    Transition( current = State.ITEM_SELECTED, Input.DISPENSE) -> State.DISPENSING
    Transition( current = State.ITEM_SELECTED, Input.CANCEL) -> State.SHOW_MENU
    else -> State.ERROR
}


fun main() {
    val state: State = State.IDLE;
    val nextState = nextState(state, Input.COIN)
    val nextState2 = nextState(nextState, Input.CHOOSE_DRINK)
    val nextState3 = nextState(nextState2, Input.DISPENSE)
    println("$state $nextState $nextState2 $nextState3");
}