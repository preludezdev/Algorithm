package programmers.스킬트리

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(2, sol.solution("CBD",arrayOf("BACDE", "CBADF", "AECB", "BDA")))
    }

}