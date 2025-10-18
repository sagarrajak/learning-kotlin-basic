package com.testkotlin.function_example

class Matrix(val n: Int, val m: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Matrix
        if (n != other.n) return false
        if (m != other.m) return false
        return true
    }

    override fun hashCode(): Int {
        var result = n
        result = 31 * result + m
        return result
    }

    infix fun mul(x: Int): Matrix {
        return when {
            x <= 0 -> throw Exception("Invalid value")
            else -> Matrix(this.n*x, this.m*x)
        }
    }

    infix fun add(other: Matrix): Matrix {
        require((other.n == this.n) && (other.m == this.m))
        return Matrix(this.n, this.m);
    }

    override
    fun toString(): String {
        return "Matrix(n=$n, m=$m)"
    }
}

fun main() {
    var matrix = Matrix(12, 12)
    var matrix2 = matrix mul 12
    println(matrix2);
}