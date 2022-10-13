class Solution {
    public String binary(int n, int m, int cnt) {
        StringBuilder sb = new StringBuilder();
        while(cnt != 0) {
            int tmp = n % 2 + m % 2;
            sb.append(tmp);
            n /= 2;
            m /= 2;
            cnt--;
        }
        return sb.reverse().toString();
    }
    
    public String decoding(String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) > '0')
                sb.append("#");
            else
                sb.append(" ");
        }
        return sb.toString();
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) 
            answer[i] = decoding(binary(arr1[i], arr2[i], n));
        return answer;
    }
}