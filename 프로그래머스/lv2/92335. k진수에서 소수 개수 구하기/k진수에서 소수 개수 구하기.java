import java.util.*;
class Solution {
    static int answer;
    public int solution(int n, int k) {
        answer = 0;
        String[] arr = Integer.toString(n, k).split("0");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) 
                continue;
            isPrimeNumber(arr[i]);
        }
        return answer;
    }
    static void isPrimeNumber(String prime) {
        long n = Long.parseLong(prime);
        if(n <= 1) 
            return;
        
        boolean check = false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if(n % i == 0) {
                check = true;
                break;
            }
        if(!check) 
            answer++;
    }
}