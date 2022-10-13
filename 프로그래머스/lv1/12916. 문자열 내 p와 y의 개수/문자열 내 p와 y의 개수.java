class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int chk = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'P' || temp == 'p')
                chk++;
            else if (temp == 'Y' || temp == 'y')
                chk--;
        }
        if (chk != 0)
            answer = false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}