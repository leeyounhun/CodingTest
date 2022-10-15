import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char temp;
        HashMap<Character, Integer> mbti = new HashMap<>();
        
        char[] mbtis = { 'R', 'T', 'C', 'F', 'J', 'M','A', 'N' };
        for (char ch : mbtis)
            mbti.put(ch, 0);
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4)
                temp = survey[i].charAt(0);
            else
                temp = survey[i].charAt(1);
            mbti.put(temp, mbti.get(temp) + Math.abs(choices[i] - 4));
        }
        
        for (int i = 0; i < mbtis.length; i += 2) {
            if(mbti.get(mbtis[i]) >= mbti.get(mbtis[i + 1]))
                answer += mbtis[i];
            else
                answer += mbtis[i + 1];
        }
        
        return answer;
    }
}