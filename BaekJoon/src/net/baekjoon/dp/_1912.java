package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;

public class _1912 {
	public static int[] ar;
	public static String[] sum;
	public static int max;

	public static int dp(int index) {
		if (sum[index] != null)
			return Integer.parseInt(sum[index]);
		sum[index] = Math.max(ar[index] + dp(index - 1), ar[index]) + "";
		max = Math.max(max, Integer.parseInt(sum[index]));
		return Integer.parseInt(sum[index]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ar = new int[n];
		sum = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		sum[0] = ar[0] + "";
		max = ar[0];
		dp(n - 1);
		bw.write(max + " ");
		bw.flush();
		bw.close();
	}
}