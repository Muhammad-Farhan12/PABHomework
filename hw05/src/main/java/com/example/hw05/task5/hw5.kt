package com.example.hw05.task5

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    val totalScore = students.fold(0) { sum, student -> sum + student.score }
    val average = totalScore.toDouble() / students.size

    val averageRounded = Math.round(average * 10.0) / 10.0
    println("Class average: $averageRounded")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { student ->
            val status = if (student.score >= 70) "PASS" else "FAIL"
            appendLine("${student.name.padEnd(8)} ${student.score}  $status")
        }
    }
    print(report)
}