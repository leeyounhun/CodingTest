import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hash = new HashMap<>();
        for (String name : participant)
            hash.put(name, hash.getOrDefault(name, 0) + 1);
        for (String name : completion)
            hash.put(name, hash.get(name) - 1);
        
        Iterator<Map.Entry<String, Integer>> iter = hash.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}