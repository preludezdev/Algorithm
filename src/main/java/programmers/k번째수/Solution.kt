package programmers.k번째수


class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        // 주어진 배열(array)에서 command 영역만큼 자른 뒤 오름차순으로 정렬하고 k번째 숫자를 구해 저장한다.
        commands.forEach { command ->
            val startIndex = command[0] - 1
            val endIndex = command[1] - 1
            val k = command[2] - 1

            val numAtK = array.slice(startIndex..endIndex).sorted()[k]
            answer.add(numAtK)
        }

        return answer.toIntArray()
    }
}

/**
 * 간단한 문제였다.
 * 테스트 코드 짤 때 코틀린으로 2차원 배열 초기화해서 만드는 법을 까먹어서 살짝 애먹었다.
 */