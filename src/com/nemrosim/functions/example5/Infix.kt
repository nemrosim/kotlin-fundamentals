package com.nemrosim.functions.example5

class User(var money: Int) {
    override fun toString(): String = "User has $money$"
}

infix operator fun User.plus(user: User): User {
    return User(this.money + user.money)
}

fun main() {
    val user1 = User(100)
    val user2 = User(200)
    val user3 = User(709)

    val richUser = user1 + user2 + user3
    val number = 1 + 2 + 3;

    println(richUser)
    println(number)
}

