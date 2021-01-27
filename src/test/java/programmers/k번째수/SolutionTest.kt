package programmers.k번째수

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()
        Assert.assertArrayEquals(intArrayOf(5, 6, 3), sol.solution(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))))
    }

}