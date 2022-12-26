class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        for (int i = 0; i < answer.length; i++) {
            if (num % 2 == 0)
                answer[i] = mid - num / 2 + 1 + i;
            else
                answer[i] = mid - num / 2 + i;
        }
        return answer;
    }
}