package programmers.week1.하샤드수

import org.junit.Assert
import org.junit.Test
import programmers.week1.하샤드수.Solution

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