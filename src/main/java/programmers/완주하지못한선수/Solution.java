package programmers.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String[] participants, String[] completions) {
        HashMap<String, Integer> hs = new HashMap<>();

        for (String participant : participants) {
            if (hs.containsKey(participant)) {
                int newVal = hs.get(participant) + 1;
                hs.put(participant, newVal);
            } else {
                hs.put(participant, 1);
            }
        }

        for (String completion : completions) {
            if (hs.containsKey(completion)) {
                int newVal = hs.get(completion) - 1;

                if (newVal == 0) {
                    hs.remove(completion);
                } else {
                    hs.put(completion, newVal);
                }
            } else {
                hs.put(completion, 1);
            }
        }

        return hs.keySet().iterator().next();
    }

    // 다른 풀이방법 : 정렬 이용
//    public String solution(String[] participants, String[] completions) {
//        Arrays.sort(participants);
//        Arrays.sort(completions);
//
//        String answer = participants[participants.length - 1];
//
//        for(int i = 0; i < participants.length - 1; i++) {
//            if(!participants[i].equals(completions[i])){
//                answer = participants[i];
//                break;
//            }
//        }
//
//
//        return answer;
//    }
}

/**
 * - 해쉬맵을 잘 알고있는지 물어보는 문제였다.
 * - 다른 풀이방법으로 participants 와 completions 를 정렬하고 각 인덱스별로 다른게 있는지 체크하는 방식이 있는데 꽤나 신선했다.
 * - 다음부터는 문제를 풀 때 이렇게 다르게 생각해서 풀 수 있는 방법이 있는지 생각해보고 풀어야겠다.
 */