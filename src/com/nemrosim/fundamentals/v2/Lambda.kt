package com.nemrosim.fundamentals.v2

fun main() {
    show(::printModifiedText)
}

// Unit === void
fun show(func: (text: String) -> Unit) {
    val someText = "Hello world";
    func(someText);
}


fun printModifiedText(text: String) {
    println("${text}!!!");
}