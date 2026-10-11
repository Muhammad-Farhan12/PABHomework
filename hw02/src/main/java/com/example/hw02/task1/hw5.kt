package com.example.hw02.task5

fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()

    print("Exam score: ")
    val exam = readln().toInt()

    // Gunakan 2.0 agar hasilnya menjadi Double (pecahan), bukan Int (bulat)
    val average = (assignment + exam) / 2.0

    // if sebagai expression
    val status = if (average >= 60) "Pass" else "Needs improvement"

    println("Average: $average")
    println("Status: $status")
}