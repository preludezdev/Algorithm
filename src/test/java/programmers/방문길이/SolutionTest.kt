package programmers.방문길이

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(7, sol.solution("ULURRDLLU"))
        Assert.assertEquals(7, sol.solution("LULLLLLLU"))
    }

}