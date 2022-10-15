import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < X.length(); i++) 
            arr1[X.charAt(i) - '0']++;
        for (int i = 0; i < Y.length(); i++) 
            arr2[Y.charAt(i) - '0']++;
        for (int i = 0; i < 10; i++) 
            if (arr1[i] > 0 && arr2[i] > 0) 
                for (int j = 0; j < Math.min(arr1[i], arr2[i]); j++)
                    list.add(i);
        
        Collections.sort(list, Collections.reverseOrder());
        if (list.isEmpty())
            sb.append(-1);
        else if (list.get(0) == 0)
            sb.append(0);
        else
            for(int num : list)
                sb.append(num);
        return answer = sb.toString();
    }
}