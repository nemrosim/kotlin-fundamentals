package com.nemrosim.functions.example6

import java.math.BigInteger

tailrec fun fibonacci(number: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (number == 0) b else fibonacci(number - 1, a + b, a)
}

// 0, 1, 2, 3, 4, 5, 6, 7,  8,  9,  10, 11, ... 100
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 354224848179261915075
fun main() {
    println(fibonacci(100_000, BigInteger("1"), BigInteger("0")))
}