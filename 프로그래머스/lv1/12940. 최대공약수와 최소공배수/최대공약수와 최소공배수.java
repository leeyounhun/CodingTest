class Solution {
    public int GCD(int n, int m) {
        int r = n % m;
        if (r == 0)
            return m;
        else 
            return GCD(m, r);
    }
    
    public int[] solution(int n, int m) {
        int a = GCD(n, m);
        int[] answer = { a, n * m / a};
        return answer;
    }
    
}