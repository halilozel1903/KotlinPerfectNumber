fun main() {
    val searchRange = 1..1_000

    printIntro(searchRange)

    val perfectNumberLessons = searchRange
        .asSequence()
        .map(::buildLesson)
        .filter { it.isPerfect }
        .toList()

    if (perfectNumberLessons.isEmpty()) {
        println("No perfect numbers found in this range.")
        return
    }

    perfectNumberLessons.forEach(::printLesson)
    printSummary(perfectNumberLessons)
}

data class NumberLesson(
    val number: Int,
    val properDivisors: List<Int>
) {
    val divisorSum: Int = properDivisors.sum()
    val isPerfect: Boolean = number > 1 && divisorSum == number
}

fun buildLesson(number: Int): NumberLesson =
    NumberLesson(number, properDivisors(number))

fun properDivisors(number: Int): List<Int> {
    if (number <= 1) return emptyList()

    return (1..number / 2)
        .asSequence()
        .filter { divisor -> number % divisor == 0 }
        .toList()
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
    println("Result: ${if (lesson.isPerfect) "Perfect" else "Not perfect"}")
    println("--------------------------------------------")
}

fun printSummary(lessons: List<NumberLesson>) {
    val values = lessons.joinToString { it.number.toString() }
    println("Found ${lessons.size} perfect numbers: $values")
}