package programmers.주식가격;


import java.util.Stack;

class Solution {

    // 풀이 1. 하나씩 순차적으로 보면서 값 구하기
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        for (int index = 0; index < answer.length - 1; index++) {
            answer[index] = 0;
        }

        for (int i = 0; i <= prices.length - 1; i++) {
            int currVal = prices[i];
            int duration = 0;

            for (int j = i + 1; j <= prices.length - 1; j++) {
                duration++;
                int nextVal = prices[j];

                if (currVal > nextVal) {
                    break;
                }
            }

            answer[i] = duration;
        }

        return answer;
    }

    // 풀이 2. 스택 이용
    public int[] solution2(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int currTime = 0; currTime <= prices.length - 1; currTime++) {
            int currPrice = prices[currTime];

            while (!stack.empty() && prices[stack.peek()] > currPrice) {
                int prevTime = stack.peek();
                int duration = currTime - prevTime;
                answer[prevTime] = duration;
                stack.pop();
            }

            stack.push(currTime);
        }

        int maxDuration = prices.length - 1;

        while (!stack.empty()) {
            int time = stack.pop();
            int duration = maxDuration - time;
            answer[time] = duration;
        }

        return answer;
    }
}

/**
 * 문제 보자마자 풀이.1 로 풀었다.
 * 다른 방법이 있나 찾아봤더니 스택을 이용해 풀 수 있다길래 풀이.2 대로 해봤는데 생각보다 오래 걸렸다.
 * 문제를 풀기 전에 문제내용을 정확하고 완전히 이해하고 풀어야겠다는 생각을 했다.
 */