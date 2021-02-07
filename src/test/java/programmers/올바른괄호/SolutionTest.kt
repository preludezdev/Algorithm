package programmers.올바른괄호

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals(true, sol.solution("()()"))
        Assert.assertEquals(true, sol.solution("(())()"))
        Assert.assertEquals(false, sol.solution(")()("))
        Assert.assertEquals(false, sol.solution("(()("))
    }
}