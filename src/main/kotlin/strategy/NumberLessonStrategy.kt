package strategy

import model.NumberLesson

interface NumberLessonStrategy {
    fun build(number: Int): NumberLesson
    fun isMatch(lesson: NumberLesson): Boolean
}

