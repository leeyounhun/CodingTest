import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int cnt = 0;
        while (cnt < d.length) {
            budget -= d[cnt];
            if (budget >= 0) 
                cnt++;
            else
                break;
        }
        return answer = cnt;
    }
}