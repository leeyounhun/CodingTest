class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int temp = n / a;
            answer += (temp * b);
            n = n - (a * temp) + (temp * b);
        }
        return answer;
    }
}