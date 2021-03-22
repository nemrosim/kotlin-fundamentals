package com.nemrosim.fundamentals.v7

fun main() {

    val range: IntRange = 1..5

    // 1, 2, 3, 4, 5
    for (i in range) {
        println("1. Value is $i")
    }

    // 1, 4
    for (i in range step 3) {
        println("2. Value is $i")
    }

    // 30, 20, 10
    for (i in 30 downTo 1 step 10) {
        println("3. Value is $i")
    }

    // 1, 2
    for (i in 1 until 3) {
        println("4. Value is $i")
    }

    val list = listOf<Int>(1, 2, 3)

    // 1, 2, 3
    for (i in list) {
        println("5. Value is $i")
    }

    val map = HashMap<String, Int>();
    map["one"] = 2
    map["two"] = 43
    map["three"] = -32

    // Values are one = 2 ... etc
    for ((string, int) in map) {
        println("6. Values are $string = $int")
    }
}