package net.baekjoon.dp;

import java.io.*;

public class _9461 {
	public static long[] ar = new long[101];

	public static long dp(int index) {
		if (ar[index] != 0)
			return ar[index];
		return ar[index] = dp(index - 2) + dp(index - 3);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		ar[1] = ar[2] = ar[3] = 1;
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp(N)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}