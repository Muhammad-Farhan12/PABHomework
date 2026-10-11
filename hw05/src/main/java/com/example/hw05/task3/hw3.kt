package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    val passingCount = students.filter { it.score >= 70 }.count()
    println(passingCount)

    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    students.sortedByDescending { it.score }.take(3).forEach { println(it.name) }

    val totalScore = students.fold(0) { sum, student -> sum + student.score }
    val average = totalScore.toDouble() / students.size
    println("Total: $totalScore   Average: $average")

    val groupedByYear = students.groupBy { it.year }
    groupedByYear.forEach { (year, studentList) ->
        val names = studentList.map { it.name }
        println("$year: $names")
    }
}