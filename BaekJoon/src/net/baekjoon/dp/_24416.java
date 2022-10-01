package net.baekjoon.dp;

import java.io.*;

public class _24416 {
	static int cnt1 = 1;
	static int cnt2 = 0;
	static int[] f = new int[41];

	public static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else {
			cnt1++;
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int fibonacci(int n) {

		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			cnt2++;
		}
		return f[n];
	}

	public static void main(String[] args) throws IOException {
		f[1] = f[2] = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		fib(N);
		fibonacci(N);
		bw.write(cnt1 + " " + cnt2);
		bw.flush();
		bw.close();
	}
}