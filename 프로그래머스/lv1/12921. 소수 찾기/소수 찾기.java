class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i < n + 1; i++) {
            if (!prime[i])
                answer++;
            for (int j = i * 2; j < n + 1; j += i)
                prime[j] = true;
        }
        return answer;
    }
}