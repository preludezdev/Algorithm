package programmers.방문길이;


import java.util.HashSet;

class Solution {

    private final int MAX_RANGE = 5;

    public int solution(String dirs) {

        HashSet<String> passedRoute = new HashSet();

        int startX = 0;
        int startY = 0;

        for (char currCommand : dirs.toCharArray()) {

            int endX = startX;
            int endY = startY;

            switch (currCommand) {
                case 'U' : endY++; break;
                case 'D' : endY--; break;
                case 'R' : endX++; break;
                case 'L' : endX--;
            }

            if(isValidRoute(startX, startY, endX, endY)) {
                passedRoute.add(startX + "," + startY + "," + endX + "," + endY);
                passedRoute.add(endX + "," + endY + "," + startX + "," + startY);

                startX = endX;
                startY = endY;
            }
        }

        return passedRoute.size() / 2;
    }

    // 맵을 벗어나는지 체크
    private boolean isValidRoute(int p1_x, int p1_y, int p2_x, int p2_y) {
        return (Math.abs(p1_x) <= MAX_RANGE && Math.abs(p1_y) <= MAX_RANGE) &&
                (Math.abs(p2_x) <= MAX_RANGE && Math.abs(p2_y) <= MAX_RANGE);
    }
}

// 위와 같이 HashSet 을 이용하는 방법과 아래처럼 배열에 직접 값을 넣어 문제를 해결하는 방식 두 개가 있는데
// 배열을 이용해서 푸는게 훨씬 빠르다.

/*

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        int [][][][]check = new int[11][11][11][11];
        for(Character dir : dirs.toCharArray()){
            int nextX = x, nextY = y;

            if(dir == 'U') nextY++;
            if(dir == 'D') nextY--;
            if(dir == 'R') nextX++;
            if(dir == 'L') nextX--;

            if(Math.abs(nextX) > 5 || Math.abs(nextY) > 5){
                continue;
            }

            if(check[nextX+5][nextY+5][x+5][y+5] != 1){
                check[nextX+5][nextY+5][x+5][y+5] = 1;
                check[x+5][y+5][nextX+5][nextY+5] = 1;
                answer ++;
            }

            x = nextX; y = nextY;
        }

        return answer;
    }
}

 */