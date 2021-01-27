package programmers.소수만들기

import kotlin.math.sqrt

class Solution {

    fun solution(nums: IntArray): Int {
        var result = 0

        // 주어진 숫자 중 세개를 골라 합이 소수인지 체크
        for (i in 0..nums.size - 3) {
            for (j in i + 1..nums.size - 2) {
                for (k in j + 1 until nums.size) {
                    val sum = nums[i] + nums[j] + nums[k]

                    if (isPrimeNum(sum)) {
                        result++
                    }
                }
            }
        }

        return result
    }

    private fun isPrimeNum(num: Int): Boolean {
        val half = sqrt(num.toDouble()).toInt() + 1

        for (i in 2..half) {
            if (num % i == 0) {
                return false
            }
        }

        return true
    }
}