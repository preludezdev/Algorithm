package programmers.하샤드수

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(true, sol.solution(10))
        Assert.assertEquals(true, sol.solution(12))
        Assert.assertEquals(false, sol.solution(11))
        Assert.assertEquals(false, sol.solution(13))
    }
}