class Solution {
    
    static int GCD(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = GCD(answer, arr[i]);
            answer *= arr[i] / temp;
        }
        return answer;
    }
}