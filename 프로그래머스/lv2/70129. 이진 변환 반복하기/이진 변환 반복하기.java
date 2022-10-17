class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0;
        int cnt = 0;
        int num = 0;
        while (true) {
            if (s.equals("1"))
                break;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '0')
                    zeroCnt++;
            s = s.replaceAll("0", "");
            cnt++;
            num = s.length();
            s = "";
            while (num != 0) {
                s += (num % 2);
                num /= 2;
            }
        }
        int[] answer = { cnt, zeroCnt };
        return answer;
    }
}