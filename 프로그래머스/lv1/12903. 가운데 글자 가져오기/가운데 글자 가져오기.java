class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = s.length();
        if (temp % 2 == 1)
            answer += s.charAt(temp / 2);
        else
            answer = answer + s.charAt((temp - 1) / 2) + s.charAt((temp - 1) / 2 + 1);
        return answer;
    }
}