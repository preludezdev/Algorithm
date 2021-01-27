package programmers.k번째수


class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        // 주어진 배열(array)에서 command 영역만큼 자른 뒤 오름차순으로 정렬하고 k번째 숫자를 구해 저장한다.
        commands.forEach {command ->
            val startIndex = command[0] - 1
            val endIndex = command[1] - 1
            val k = command[2]

            val numAtK = array.slice(startIndex .. endIndex).sorted()[k-1]
            answer.add(numAtK)
        }

        return answer.toIntArray()
    }
}