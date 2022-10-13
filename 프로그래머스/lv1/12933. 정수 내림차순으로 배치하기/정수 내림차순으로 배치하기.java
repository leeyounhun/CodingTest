import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = n + "";
        String[] arr = num.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String temp = "";
        for (int i = 0; i < arr.length; i++)
            temp += arr[i];
        answer = Long.parseLong(temp);
        return answer;
    }
}