class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == ' ')
                sb.append(" ");
            else {
                if (Character.isLowerCase(temp))
                    sb.append((char) ((temp + n - 'a') % 26 + 'a'));
                else
                    sb.append((char) ((temp + n - 'A') % 26 + 'A'));
            }
        }
        return answer = sb.toString();
    }
}