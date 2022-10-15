class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9\\-_.]*", "");
        answer = answer.replaceAll("\\.+", ".");
        if (answer.charAt(0) == '.')
            answer = answer.substring(1);
        if (answer.length() != 0 && answer.charAt(answer.length() - 1) == '.')
            answer = answer.substring(0, answer.length() - 1);
        if (answer.equals(""))
            answer += "a";
        if (answer.length() > 15)
            answer = answer.substring(0, 15);
        if (answer.charAt(answer.length() - 1) == '.')
            answer = answer.substring(0, answer.length() - 1);
        if (answer.length() < 3) {
            String temp = answer.charAt(answer.length() - 1) + "";
            while (answer.length() < 3) {
                answer += temp;
            }
        }
        return answer;
    }
}