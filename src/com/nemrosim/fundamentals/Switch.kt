package com.nemrosim.fundamentals.v5

fun main() {

    val value = 42

    val result = when {
        value > 100 -> 32
        value > 50 -> 12
        value > 32 -> 18
        else -> 0
    }

    println("Result is $result")
}