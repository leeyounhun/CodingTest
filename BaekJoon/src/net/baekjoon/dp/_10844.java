package net.baekjoon.dp;

import java.io.*;

public class _10844 {
	public static Long[][] ar;

	public static long dp(int index, int value) {
		if (index == 1)
			return ar[index][value];
		if (ar[index][value] == null) {
			if (value == 0)
				ar[index][value] = dp(index - 1, 1);
			else if (value == 9)
				ar[index][value] = dp(index - 1, 8);
			else
				ar[index][value] = dp(index - 1, value - 1) + dp(index - 1, value + 1);
		}
		return ar[index][value] % 1000000000;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new Long[N + 1][10];
		for (int i = 0; i < 10; i++)
			ar[1][i] = 1L;
		long result = 0;
		for (int i = 1; i < 10; i++)
			result += dp(N, i);
		bw.write(result % 1000000000 + "");
		bw.flush();
		bw.close();
	}
}
