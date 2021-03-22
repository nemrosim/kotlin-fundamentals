package com.nemrosim.fundamentals.v4

class User {
    val name = null
}

fun main() {
    val user: User? = User()
    println("User's name is ${user?.name}")
}