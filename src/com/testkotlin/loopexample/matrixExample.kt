package com.testkotlin.loopexample


fun processMatrix(matrix: Array<Array<IntArray>>, target: Int) {
    outer@ for (i in matrix.indices) {
        middle@ for (j in matrix[i].indices) {
            inner@ for (k in matrix[i][j].indices) {
                val value = matrix[i][j][k];
                when {
                    value == target -> {
                        print(" Found value at ($i, $j, $k)")
                        break@outer;
                    }
                    else ->  {
                        matrix[i][j][k] = 2*value
                    }
                }
            }
        }
    }
}

fun main() {
    val matrix = arrayOf(
        arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)),
        arrayOf(intArrayOf(7, 8, 9), intArrayOf(10, 11, 12)
    )
    )
    processMatrix(matrix, 9)
}