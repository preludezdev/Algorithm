package programmers.week1.다음큰숫자;

class Solution {

    public int solution(int n) {

        int target = getCount(n);
        int currCount;

        while(true){
            n += 1;
            currCount = getCount(n);

            if(currCount == target){
                break;
            }
        }

        return n;
    }


    public int getCount(int n) {

        int sum = 0;

        while(n > 0){
            sum += (n % 2);
            n /= 2;
        }

        return sum;
    }
}
