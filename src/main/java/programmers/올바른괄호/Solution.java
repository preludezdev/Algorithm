package programmers.올바른괄호;

class Solution {

    boolean solution(String s) {

        int bracketDiffCount = 0;

        for (char c : s.toCharArray()) {
            bracketDiffCount = (c == '(') ? bracketDiffCount + 1 : bracketDiffCount - 1;

            if (bracketDiffCount < 0) {
                return false;
            }
        }

        return bracketDiffCount == 0;
    }
}

/**
 * 문제에서 주어진 조건대로 조건 비교해가면서 풀었다. 포인트는
 * 1. 문자열 왼쪽에서부터 비교해 나갈 때 ')' 의 갯수가 '(' 보다 많으면 안된다는 것,
 * 2. 그리고 문자열을 다 돌았을 때 '(' 와 ')' 의 갯수가 같은지
 * 비교해보면 된다.
 */