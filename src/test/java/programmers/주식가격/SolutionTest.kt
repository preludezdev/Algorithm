package programmers.주식가격

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        //Assert.assertArrayEquals(intArrayOf(4,3,1,1,0), sol.solution(intArrayOf(1,2,3,2,3)))
        Assert.assertArrayEquals(intArrayOf(1,1,1,1,0), sol.solution(intArrayOf(5,4,3,2,1)))
    }
}