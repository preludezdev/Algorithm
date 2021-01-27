package programmers.소수만들기

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(1, sol.solution(intArrayOf(1,2,3,4)))
        Assert.assertEquals(4, sol.solution(intArrayOf(1,2,7,6,4)))
    }

}