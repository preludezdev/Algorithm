package programmers.스킬트리;


import java.util.HashMap;

class Solution {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character, Integer> skill_order = new HashMap<>();

        for (int index = 0; index < skill.length(); index++) {
            char currSkill = skill.charAt(index);
            skill_order.put(currSkill, index);
        }

        for (String skill_tree : skill_trees) {
            if (isValidSkillTree(skill_order, skill_tree)) {
                answer++;
            }
        }

        return answer;
    }

    /**
     * 1. 해당 스킬들이 선행순서에 맞게 소팅되어있는지 체크
     * 2. 맞으면 true, 아니면 false
     * 3. 또한, 먼저 배워야할 스킬을 배우지 않았으면 false
     */
    private boolean isValidSkillTree(HashMap<Character, Integer> skill_order, String skill_tree) {
        int orderIndex = -1;

        for (char skill : skill_tree.toCharArray()) {
            if (skill_order.containsKey(skill)) {
                int currIndex = skill_order.get(skill);

                if (currIndex >= orderIndex && currIndex <= orderIndex + 1) {
                    orderIndex = currIndex;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}


/**
 * 쉽게 풀었다.
 */