package programmers.모의고사

import kotlin.math.max

class Solution {

    data class Person(
            val id: Int,
            var correctAnswerCount: Int,
            val getAnswer: (n: Int) -> Int
    )

    fun solution(answers: IntArray): IntArray {

        val personOne = Person(1, 0) { (it % 5) + 1 }
        val personTwo = Person(2, 0) {
            if (it % 2 == 0) 2 else when ((it / 2) % 4) {
                0 -> 1
                1 -> 3
                2 -> 4
                else -> 5
            }
        }
        val personThree = Person(3, 0) {
            when (it % 10) {
                0, 1 -> 3
                2, 3 -> 1
                4, 5 -> 2
                6, 7 -> 4
                else -> 5
            }
        }

        answers.forEachIndexed { n, answer ->
            if (personOne.getAnswer(n) == answer) personOne.correctAnswerCount++
            if (personTwo.getAnswer(n) == answer) personTwo.correctAnswerCount++
            if (personThree.getAnswer(n) == answer) personThree.correctAnswerCount++
        }

        val result = mutableListOf<Int>()
        val max = max(max(personOne.correctAnswerCount, personTwo.correctAnswerCount), personThree.correctAnswerCount)

        if (max == personOne.correctAnswerCount) result.add(personOne.id)
        if (max == personTwo.correctAnswerCount) result.add(personTwo.id)
        if (max == personThree.correctAnswerCount) result.add(personThree.id)

        return result.toIntArray()
    }

}