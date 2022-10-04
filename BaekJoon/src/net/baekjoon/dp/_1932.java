package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;

public class _1932 {
	public static int[][] ar;
	public static Integer[][] dpar;
	public static int N;

	public static int dp(int depth, int index) {
		if (depth == N - 1)
			return dpar[depth][index];
		if (dpar[depth][index] == null)
			dpar[depth][index] = Math.max(dp(depth + 1, index), dp(depth + 1, index + 1)) + ar[depth][index];
		return dpar[depth][index];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N][N];
		dpar = new Integer[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i + 1; j++)
				ar[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++)
			dpar[N - 1][i] = ar[N - 1][i];
		bw.write(dp(0, 0) + "");
		bw.flush();
		bw.close();
	}
}
