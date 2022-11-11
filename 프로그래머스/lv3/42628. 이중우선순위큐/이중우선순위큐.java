import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String[] temp = operations[i].split(" ");
            if(temp[0].equals("I")) {
                arr.add(Integer.parseInt(temp[1]));
                Collections.sort(arr, Collections.reverseOrder());
            } else if (arr.size() != 0) {
            if(temp[1].equals("1"))
                    arr.remove(0);
            else 
                    arr.remove(arr.size() - 1);
            }
        }
        if (arr.size() == 0)
            answer = new int[] { 0, 0 };
        else
            answer = new int[] { arr.get(0), arr.get(arr.size() - 1) };
        return answer;
    }
}