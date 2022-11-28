import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : scoville)
            queue.offer(num);
        while (queue.peek() < K) {
            if (queue.size() == 1)
                return -1;
            int temp = queue.poll() + queue.poll() * 2;
            queue.offer(temp);
            answer++;
        }
        return answer;
    }
}