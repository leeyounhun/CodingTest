import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s," ", true);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String temp = st.nextToken().toLowerCase();
            if (temp.equals(" "))
                sb.append(" ");
            else
                for (int i = 0; i < temp.length(); i++) {
                    if (i % 2 == 0) 
                        sb.append((char)(temp.charAt(i) - 32));
                    else
                        sb.append(temp.charAt(i));
                }
        }
        String answer = sb.toString();
        return answer;
    }
}