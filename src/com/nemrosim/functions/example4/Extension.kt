package com.nemrosim.functions.example4

fun calculate(a: Int, b: Int): Int {
    return a + b
}

fun Int.addAStringToNumber(): String {
    return "$this. This is a very nice number!"
}

fun main() {
    print(calculate(2, 2).addAStringToNumber())
}

