package model

data class NumberLesson(
    val number: Int,
    val properDivisors: List<Int>
) {
    val divisorSum: Int = properDivisors.sum()
}

