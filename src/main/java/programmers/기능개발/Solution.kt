package programmers.기능개발


class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        var currDeploy = 0

        while (currDeploy < progresses.size) {

            var addDeploy = 0
            for (index in currDeploy until progresses.size) {
                val newVal = progresses[index] + speeds[index]
                progresses[index] = if (newVal > 100) 100 else newVal

                if (currDeploy == index && progresses[index] == 100) {
                    addDeploy++
                    currDeploy++
                }
            }

            if (addDeploy > 0) {
                answer.add(addDeploy)
            }
        }

        return answer.toIntArray()
    }
}

/**
 * 간단한 문제였다.
 * 큐 써서 문제 푼 사람들도 많던데 그냥 이렇게 풀어도 괜찮을 것 같다.
 */