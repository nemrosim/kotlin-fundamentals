package com.nemrosim.functions.example2

@JvmOverloads
fun defaultParams(text: String? = "John"): String? {
    return text
}

fun main() {
    println(defaultParams())
}