package net.baekjoon.dp;

import java.io.*;

public class _1904 {
	public static int fib[] = new int[1000001];

	public static int dp(int N) {
		if (N == 1)
			return fib[1] = 1;
		if (N == 2)
			return fib[2] = 2;
		if (fib[N] == -1)
			fib[N] = (dp(N - 1) + dp(N - 2)) % 15746;
		return fib[N];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 3; i < fib.length; i++)
			fib[i] = -1;
		bw.write(dp(N) + "");
		bw.flush();
		bw.close();
	}
}
