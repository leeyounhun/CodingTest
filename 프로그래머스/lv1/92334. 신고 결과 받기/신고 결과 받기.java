import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> reporter = new HashMap<>();
        HashMap<String, Integer> reported = new HashMap<>();
        
        for (String id : id_list) {
            reporter.put(id, 0);
            reported.put(id, 0);
        }
        
        ArrayList<String []> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(report));
        Iterator iter = set.iterator();        
        while(iter.hasNext()) {
            String[] temp = iter.next().toString().split(" ");
            list.add(temp);
            reported.put(temp[1], reported.get(temp[1]) + 1);
        }
        
        for (int i = 0; i < list.size(); i++) 
            if(reported.get(list.get(i)[1]) >= k) 
                reporter.put(list.get(i)[0], reporter.get(list.get(i)[0]) + 1);
        
        for (int i = 0; i < answer.length; i++) 
            answer[i] = reporter.get(id_list[i]);
        
        return answer;
    }
}