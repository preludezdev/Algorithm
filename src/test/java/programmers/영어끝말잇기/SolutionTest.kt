package programmers.영어끝말잇기

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertArrayEquals(intArrayOf(3,3), sol.solution(3, arrayOf("tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank")))
        Assert.assertArrayEquals(intArrayOf(0,0), sol.solution(5, arrayOf("hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive")))
        Assert.assertArrayEquals(intArrayOf(1,3), sol.solution(2, arrayOf("hello", "one", "even", "never", "now", "world", "draw")))
    }

}