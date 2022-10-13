import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            if(n == 0)
                break;
            arr.add(n % 3);
            n /= 3;
        }
        Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++) 
            answer += (int) Math.pow(3, i) * arr.get(i);

        return answer;
    }
}