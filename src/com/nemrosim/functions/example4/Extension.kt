package com.nemrosim.functions.example4

fun calculate(a: Int, b: Int): Int {
    return a + b
}

fun addAStringToNumber(number:Int):String{
    return "$number. This is a very nice number!"
}

fun main() {
    print(addAStringToNumber(calculate(2, 2)))
}

