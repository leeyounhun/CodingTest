import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < works.length; i++) 
            q.offer(works[i]);
        while (n > 0) {
            int work = q.poll();
            if (work == 0)
                break;
            work--;
            q.offer(work);
            n--;
        }
        long answer = 0;
        for(int work : q) 
            answer += work * work;
        return answer;
    }
}