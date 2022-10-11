package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _2565 {
	public static int[][] ar;
	public static Integer[] dp;

	public static int dp(int index) {
		if (dp[index] == null) {
			dp[index] = 1;
			for (int i = index + 1; i < dp.length; i++) {
				if (ar[index][1] < ar[i][1]) {
					dp[index] = Math.max(dp[index], dp(i) + 1);
				}
			}
		}
		return dp[index];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ar = new int[n][2];
		dp = new Integer[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ar[i][0] = Integer.parseInt(st.nextToken());
			ar[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar, (o1, o2) -> {
			return o1[0] - o2[0];
		});
		int max = 0;
		for (int i = 0; i < n; i++)
			max = Math.max(dp(i), max);
		bw.write(n - max + "");
		bw.flush();
		bw.close();
	}
}