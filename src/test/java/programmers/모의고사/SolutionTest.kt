package programmers.모의고사

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertArrayEquals(intArrayOf(1), sol.solution(intArrayOf(1,2,3,4,5)))
        Assert.assertArrayEquals(intArrayOf(1,2,3), sol.solution(intArrayOf(1,3,2,4,2)))
    }
}