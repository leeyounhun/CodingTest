import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        if (cacheSize == 0)
            return answer = 5 * cities.length;
        for (int i = 0; i < cities.length; i++){
            String temp = cities[i].toLowerCase();
            if(queue.contains(temp)) {
                queue.remove(temp);
                queue.offer(temp);
                answer += 1;
            } else if (queue.size() < cacheSize) {
                queue.offer(temp);
                answer += 5;
            } else {
                queue.poll();
                queue.offer(temp);
                answer += 5;
            }
        }
        return answer;
    }
}