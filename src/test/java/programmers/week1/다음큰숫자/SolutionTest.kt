package programmers.week1.다음큰숫자

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(83, sol.solution(78))
        Assert.assertEquals(23, sol.solution(15))
    }
}