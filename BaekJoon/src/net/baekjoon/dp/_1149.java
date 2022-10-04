package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;

public class _1149 {
	public static int[][] ar;
	public static int[][] dpar;

	public static int dp(int color, int N) {
		if (dpar[N][color] == 0) {
			switch (color) {
			case 0:
				dpar[N][0] = Math.min(dp(1, N - 1), dp(2, N - 1)) + ar[N][0];
				break;
			case 1:
				dpar[N][1] = Math.min(dp(0, N - 1), dp(2, N - 1)) + ar[N][1];
				break;
			case 2:
				dpar[N][2] = Math.min(dp(0, N - 1), dp(1, N - 1)) + ar[N][2];
				break;
			}
		}
		return dpar[N][color];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N][3];
		dpar = new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++)
				ar[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 3; i++)
			dpar[0][i] = ar[0][i];
		int min = Math.min(Math.min(dp(0, N - 1), dp(1, N - 1)), dp(2, N - 1));
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
}