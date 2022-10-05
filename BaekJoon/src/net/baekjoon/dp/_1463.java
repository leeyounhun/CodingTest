package net.baekjoon.dp;

import java.io.*;

public class _1463 {
	public static Integer[] ar;

	public static int dp(int N) {
		if (ar[N] == null) {
			if (N % 3 == 0)
				ar[N] = Math.min(dp(N / 3), dp(N - 1)) + 1;
			else if (N % 2 == 0)
				ar[N] = Math.min(dp(N / 2), dp(N - 1)) + 1;
			else
				ar[N] = dp(N - 1) + 1;
		}
		return ar[N];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new Integer[N + 1];
		ar[1] = 0;
		bw.write(dp(N) + "");
		bw.flush();
		bw.close();
	}
}
