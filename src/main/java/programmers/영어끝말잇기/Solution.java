package programmers.영어끝말잇기;


import java.util.HashSet;

class Solution {

    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> pastWords = new HashSet<>();
        pastWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            int currN = (i % n) + 1;
            int currTurn = (i / n) + 1;
            String currWord = words[i];
            String prevWord = words[i - 1];

            // 지는 조건
            // 1. 이전 단어와 현재 단어가 이어지지 않는지
            // 2. 현재 단어가 이전에 썼던 단어인지
            if (prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0) || pastWords.contains(currWord)) {
                answer[0] = currN;
                answer[1] = currTurn;
                break;
            }

            pastWords.add(currWord);
        }

        return answer;
    }
}
