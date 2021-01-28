package programmers.문자열내마음대로정렬하기

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertArrayEquals(arrayOf("car", "bed", "sun"), sol.solution(arrayOf("sun", "bed", "car"), 1))
        Assert.assertArrayEquals(arrayOf("abcd", "abce", "cdx"), sol.solution(arrayOf("abce", "abcd", "cdx"), 2))
    }

}