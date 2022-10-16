import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[st.countTokens()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        answer = answer + arr[0] + " " + arr[arr.length-1];
        return answer;
    }
}