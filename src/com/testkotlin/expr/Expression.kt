package com.testkotlin.expr


interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr


fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value;
    }
    if (e !is Sum)
        throw Exception("invalid data passed")
    return eval(e.left) + eval(e.right);
}

fun eval2(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval2(e.left) + eval2(e.right)
    else ->  throw Exception("invalid data passed")
}


fun main() {
    val newExpr = Sum(Num(19), Num(12));
    val newExpr2 = Sum(Sum(Num(12), Num(13)), Num(12));
    println(eval2(newExpr2));
}