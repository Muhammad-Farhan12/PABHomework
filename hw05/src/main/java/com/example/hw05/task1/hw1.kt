package com.example.hw05.task1

fun main() {
    val double: (Int) -> Int = { number -> number * 2 }
    println(double(7))

    val startsWithVowel: (String) -> Boolean = { str ->
        val firstChar = str.lowercase().firstOrNull()
        firstChar in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    val larger: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(larger(12, 7))
}