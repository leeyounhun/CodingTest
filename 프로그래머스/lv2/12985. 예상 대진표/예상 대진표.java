class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(!((Math.abs(a - b) == 1) && Math.max(a, b) % 2 == 0)) {
            a = (int) Math.round((float) a / 2);
            b = (int) Math.round((float) b / 2);
            answer++;
        }
        return answer;
    }
}