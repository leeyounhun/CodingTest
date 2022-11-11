class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if (n > s)
            answer = new int[] {-1};
        else {
            int temp = s / n;
            int sum = temp * n;
            for(int i = 0; i < n; i++)
                answer[i] = temp;
            int i = 1;
            while (sum != s){
                answer[n-i]++;
                i++;
                sum++;
            }
        }
        return answer;
    }
}