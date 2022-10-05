package net.baekjoon.dp;

import java.io.*;

public class _2579 {
	public static int[] ar;
	public static Integer[] dpar;

	public static int dp(int N) {
		if (dpar[N] == null)
			dpar[N] = Math.max(dp(N - 2), dp(N - 3) + ar[N - 1]) + ar[N];
		return dpar[N];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N + 1];
		dpar = new Integer[N + 1];
		for (int i = 1; i <= N; i++)
			ar[i] = Integer.parseInt(br.readLine());
		dpar[1] = ar[1];
		dpar[0] = ar[0];
		if (N >= 2)
			dpar[2] = ar[1] + ar[2];
		bw.write(dp(N) + "");
		bw.flush();
		bw.close();
	}
}
