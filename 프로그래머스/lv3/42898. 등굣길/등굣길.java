public class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n][m];
        arr[0][0] = 1;
        for (int[] puddle : puddles)
            arr[puddle[1] - 1][puddle[0] - 1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == -1) {
                    arr[i][j] = 0;
                    continue;
                }
                if(i != 0)
                    arr[i][j] += arr[i - 1][j] % 1000000007;
                if(j != 0)
                    arr[i][j] += arr[i][j - 1] % 1000000007;
            }
        }
        return arr[n - 1][m - 1] % 1000000007;
    }
}