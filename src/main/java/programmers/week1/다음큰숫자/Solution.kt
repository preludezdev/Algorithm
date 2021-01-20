package programmers.week1.다음큰숫자

class Solution {

    fun solution(x: Int): Boolean {

        var currX = x
        var factor = 0

        while(currX > 0){
           factor += currX % 10
           currX /= 10
        }

        return x % factor == 0
    }
}