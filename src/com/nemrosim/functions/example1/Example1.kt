@file:JvmName("KotlinClass")

package com.nemrosim.functions.example1

fun firstFunction(text: String?, number: Int): Boolean {
    println("Hello, $text! Number is $number")
    return true
}

fun secondFunction(a: Int, b: Int): Boolean = a == b

fun main() {
    val isTrue = firstFunction("Hello", 42)
    val isEqual = secondFunction(2, 3)

    println("isTrue $isTrue")
    println("isEqual $isEqual")
}