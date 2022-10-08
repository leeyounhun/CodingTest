package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;

public class _11053 {
	public static int ar[];
	public static int dp[];

	public static int dp(int N) {
		if (dp[N] == 0) {
			dp[N] = 1;
			for (int i = N - 1; i >= 0; i--)
				if (ar[i] < ar[N])
					dp[N] = Math.max(dp[N], dp[i] + 1);
		}
		return dp[N];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < ar.length; i++)
			dp(i);
		int max = 0;
		for (int seq : dp)
			max = Math.max(seq, max);
		bw.write(max + " ");
		bw.flush();
		bw.close();
	}
}
