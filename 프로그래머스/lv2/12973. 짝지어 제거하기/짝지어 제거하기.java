import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty() || (stack.peek() != s.charAt(i)))
                stack.push(s.charAt(i));
            else 
                stack.pop();
        }
        if (stack.isEmpty())
            answer = 1;
        return answer;
    }
}