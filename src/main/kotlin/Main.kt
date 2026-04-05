import model.NumberLesson
import strategy.NumberLessonStrategy
import strategy.PerfectNumberStrategy

fun main() {
    val searchRange = 1..1_000
    val strategy: NumberLessonStrategy = PerfectNumberStrategy()

    printIntro(searchRange)

    val perfectNumberLessons = searchRange
        .asSequence()
        .map(strategy::build)
        .filter(strategy::isMatch)
        .toList()

    if (perfectNumberLessons.isEmpty()) {
        println("No perfect numbers found in this range.")
        return
    }

    perfectNumberLessons.forEach(::printLesson)
    printSummary(perfectNumberLessons)
}

fun printIntro(range: IntRange) {
    println("--------------------------------------------")
    println("Perfect Number Explorer")
    println("A perfect number equals the sum of its proper divisors.")
    println("Searching in range: ${range.first}..${range.last}")
    println("--------------------------------------------")
}

fun printLesson(lesson: NumberLesson) {
    val divisorsText = lesson.properDivisors.joinToString(" + ")

    println("Number: ${lesson.number}")
    println("Proper divisors: $divisorsText = ${lesson.divisorSum}")
    println("Result: Perfect")
    println("--------------------------------------------")
}

fun printSummary(lessons: List<NumberLesson>) {
    val values = lessons.joinToString { it.number.toString() }
    println("Found ${lessons.size} perfect numbers: $values")
}