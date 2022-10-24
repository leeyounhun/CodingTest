import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cnt; i++){  
            s = s.substring(1, cnt) + s.substring(0, 1); 
            for (int j = 0; j < cnt; j++) {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(j));
                    continue;
                }
                if (stack.peek() == ')' || stack.peek() == ']' || stack.peek() == '}') {
                    break;
                }
                if (stack.peek() == '(' && s.charAt(j) == ')')
                    stack.pop();
                else if (stack.peek() == '[' && s.charAt(j) == ']')
                    stack.pop();
                else if (stack.peek() == '{' && s.charAt(j) == '}')
                    stack.pop();
                else 
                    stack.push(s.charAt(j));
            }
            if (stack.isEmpty())
                answer++;
            else 
                while (!stack.isEmpty())
                    stack.pop();
        }
        return answer;
    }
}