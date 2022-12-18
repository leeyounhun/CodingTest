import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) 
            map.put(size, map.getOrDefault(size, 0) + 1);
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        for (Integer num : keys) {
            if (k <= 0) 
                break;
            answer++;
            k -= map.get(num);
        }
        
        return answer;
    }
}