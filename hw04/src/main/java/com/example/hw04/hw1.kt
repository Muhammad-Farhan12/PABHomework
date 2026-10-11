enum class CourseStatus {
    ACTIVE, COMPLETED
}

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
    val courses = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("INF202", "Artificial Intelligence", CourseStatus.COMPLETED),
        Course("INF303", "Data Science", CourseStatus.ACTIVE)
    )

    courses.add(Course("INF404", "Machine Learning", CourseStatus.ACTIVE))

    courses.remove(Course("INF202", "Artificial Intelligence", CourseStatus.COMPLETED))
    for (course in courses) {
        println(course.displayInfo())
    }

    println("\n--- Hasil Destructuring ---")
    val (code, name, status) = courses[0]
    println("Code: $code")
    println("Name: $name")
    println("Status: $status")
}