package net.baekjoon.dp;

import java.io.*;

public class _2156 {
	public static int[] ar;
	public static Integer[] dp;

	public static int dp(int index) {
		if (dp[index] == null)
			dp[index] = Math.max(Math.max(dp(index - 2), dp(index - 3) + ar[index - 1]) + ar[index], dp(index - 1));
		return dp[index];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ar = new int[n + 1];
		dp = new Integer[n + 1];
		for (int i = 1; i <= n; i++)
			ar[i] = Integer.parseInt(br.readLine());
		dp[0] = ar[0];
		dp[1] = ar[1];
		if (n > 1)
			dp[2] = ar[1] + ar[2];
		bw.write(dp(n) + "");
		bw.flush();
		bw.close();
	}
}
