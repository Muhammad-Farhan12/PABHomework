package com.example.hw02.task2

fun main() {
    // Part A: if / else if / else
    val daysRemaining = 2
    if (daysRemaining < 0) {
        println("Overdue")
    } else if (daysRemaining == 0) {
        println("Due today")
    } else {
        println("Upcoming")
    }

    // Part B: when
    val month = 9
    val monthName = when (month) {
        1 -> "January"
        // ... (lanjutkan sampai 8)
        9 -> "September"
        // ... (lanjutkan sampai 12)
        else -> "Invalid month"
    }
    println("Month $month: $monthName")
}