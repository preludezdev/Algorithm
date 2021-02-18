package programmers.기능개발

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertArrayEquals(intArrayOf(2,1), sol.solution(intArrayOf(93,30,55), intArrayOf(1,30,5)))
        Assert.assertArrayEquals(intArrayOf(1,3,2), sol.solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1)))
    }
}