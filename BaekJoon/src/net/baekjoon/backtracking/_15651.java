package net.baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class _15651 {
	public static int[] ar;
	public static StringBuilder sb = new StringBuilder();

	public static void dfs(int depth, int N, int M) {
		if (depth == M) {
			for (int num : ar)
				sb.append(num).append(" ");
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= N; i++) {
			ar[depth] = i;
			dfs(depth + 1, N, M);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ar = new int[M];
		dfs(0, N, M);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
