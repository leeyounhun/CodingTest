import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (char c : arr)
            sb.append(c);
        answer = sb.reverse().toString();
        return answer;
    }
}