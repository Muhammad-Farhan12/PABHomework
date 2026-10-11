package com.example.hw02.task3

fun main() {
    val numberOfDays = 5

    // Part A: Loop normal
    for (day in 1..numberOfDays) {
        println("Day $day: Study for 20 minutes")
    }

    println() // Pemisah output

    // Part B: Loop dengan step
    for (day in 1..numberOfDays step 2) {
        println("Day $day: Study for 20 minutes")
    }
}