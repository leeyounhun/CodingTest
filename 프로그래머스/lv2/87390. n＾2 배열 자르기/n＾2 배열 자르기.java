class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        int index = 0;
        for (long i = left; i < right + 1; i++){
            int temp = (int)(i / n) + 1;
            int temp2 = (int)(i % n) + 1;
            answer[index] = Math.max(temp, temp2);
            index++;
        }
        return answer;
    }
}