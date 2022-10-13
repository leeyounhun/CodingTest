import java.util.Arrays;
class Solution {
    
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < sizes.length; i++)
            Arrays.sort(sizes[i]);
        for (int i = 0; i < sizes.length; i++) {
            max1 = Math.max(max1, sizes[i][0]);
            max2 = Math.max(max2, sizes[i][1]);
        }
        return answer = max1 * max2;
    }
}