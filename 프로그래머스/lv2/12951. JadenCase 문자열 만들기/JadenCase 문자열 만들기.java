import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            answer = answer + str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
        return answer;
    }
}