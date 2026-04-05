package strategy

import model.NumberLesson

class PerfectNumberStrategy : NumberLessonStrategy {
    override fun build(number: Int): NumberLesson {
        val divisors = properDivisors(number)
        return NumberLesson(number, divisors)
    }

    override fun isMatch(lesson: NumberLesson): Boolean {
        return lesson.number > 1 && lesson.divisorSum == lesson.number
    }

    private fun properDivisors(number: Int): List<Int> {
        if (number <= 1) return emptyList()

        return (1..number / 2)
            .asSequence()
            .filter { divisor -> number % divisor == 0 }
            .toList()
    }
}

