class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = x + "";
        int temp = 0;
        for (int i = 0; i < num.length(); i++)
            temp += num.charAt(i) - '0';
        if (x % temp != 0)
            answer = false;
        return answer;
    }
}