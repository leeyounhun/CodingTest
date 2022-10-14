import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                if (!stack.contains(temp))
                    stack.push(temp);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) 
            answer[i] = stack.pop();
        Arrays.sort(answer);
        return answer;
    }
}