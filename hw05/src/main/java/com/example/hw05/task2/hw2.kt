package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    for (item in items) {
        if (condition(item)) {
            println(item)
        }
    }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    val result = mutableListOf<String>()
    for (item in list) {
        result.add(mapper(item))
    }
    return result
}

fun main() {
    val double = { number: Int -> number * 2 }
    println(applyTwice(3, double))

    val courses = listOf("Mobile App", "Artificial Intelligence", "Data Science", "Embedded Systems", "UI/UX")
    val startsWithVowel: (String) -> Boolean = { str ->
        str.lowercase().firstOrNull() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, startsWithVowel)

    val numbers = listOf(2, 3, 4)
    println(transform(numbers) { (it * it).toString() })
}