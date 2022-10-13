import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arL = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] % divisor == 0)
                arL.add(arr[i]); 
        if (arL.size() == 0) {
            answer = new int[] { -1 };
        } else {
            answer = new int[arL.size()];
            for (int i = 0; i < answer.length; i++) 
                answer[i] = arL.get(i);
            Arrays.sort(answer);     
        }
        return answer;
    }
}