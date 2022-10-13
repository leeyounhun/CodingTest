class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = n;
        while (true) {
            if (num == 1)
                break;
            if (answer == 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }
        }
        return answer;
    }
}