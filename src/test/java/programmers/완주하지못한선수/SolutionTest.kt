package programmers.완주하지못한선수

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun solutionTest() {
        val sol = Solution()

        Assert.assertEquals("leo", sol.solution(arrayOf("leo", "kiki", "eden"), arrayOf("eden", "kiki")))
        Assert.assertEquals("vinko", sol.solution(arrayOf("marina", "josipa", "nikola", "vinko", "filipa"), arrayOf("josipa", "filipa", "marina", "nikola")))
        Assert.assertEquals("mislav", sol.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
    }
}