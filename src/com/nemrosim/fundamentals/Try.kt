package com.nemrosim.fundamentals.v6

import java.lang.NumberFormatException

fun main() {
    val number = "Hello world";

    val result: Int? = try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        null
    }

    println("Result is $result")
}