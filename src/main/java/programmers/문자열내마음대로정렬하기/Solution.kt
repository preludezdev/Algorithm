package programmers.문자열내마음대로정렬하기


class Solution {

    /**
     * 내 풀이 - Comparator 를 이용해 소팅
     */

    /**
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val factors = mutableListOf<Pair<Char, String>>()

        strings.forEach { string ->
            factors.add(Pair(string[n], string))
        }

        return factors.sortedWith(Comparator { t1, t2 ->
            if (t1.first > t2.first) 1
            else if (t1.first == t2.first) if (t1.second > t2.second) 1 else -1
            else -1
        }).map { it.second }.toTypedArray()
    }
    */

    /**
     * 두 번째 풀이
     * 주어진 문자열 마다 해당 문자열 앞에 n번째 문자를 위치시켜 소팅
     * 리턴할 때는 다시 제일 앞에 위치시켰던 n번째 문자 빼고 리턴
     */
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val factors = mutableListOf<String>()

        strings.forEach { string ->
            factors.add(string[n] + string)
        }

        return factors
                .sorted()
                .map { it.substring(1 until it.length) }
                .toTypedArray()
    }

    /**
     * 나는 주어진 문제를 그대로 따라가면서 해결하는 정직한 방법으로 풀었는데
     * 인터넷에 있는 두 번째 풀이 방법보고 굉장히 참신하다고 생각했다.
     * 문제가 있으면 주어진 문제 상황 가지고 그대로 풀 생각만 했지 주어진 인풋값을 가공한다는 생각은 한번도 안해본 것 같다.
     * 신기했다.
     */

}