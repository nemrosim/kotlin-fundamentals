package com.nemrosim.functions.example3

fun myFunction(name: String, surname: String) {
    println("Name: $name, surname: $surname")
}

fun main() {
    myFunction(
        surname = "Doe",
        name = "John"
    )
}