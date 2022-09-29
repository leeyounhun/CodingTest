package net.baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class _14889 {
	public static boolean[] visited;
	public static int[][] ar;
	public static int N;
	public static int min = 100;

	public static void divTeam(int index, int depth) {
		if (depth == N / 2) {
			diff();
			return;
		}
		for (int i = index; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				divTeam(i + 1, depth + 1);
				visited[i] = false;
			}
		}
	}

	public static void diff() {
		int temaA = 0;
		int temaB = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visited[i] && visited[j]) {
					temaA += ar[i][j];
					temaA += ar[j][i];
				} else if (!visited[i] && !visited[j]) {
					temaB += ar[i][j];
					temaB += ar[j][i];
				}
			}
		}
		if (Math.abs(temaA - temaB) == 0) {
			System.out.println("0");
			System.exit(0);
		}
		if (Math.abs(temaA - temaB) < min)
			min = Math.abs(temaA - temaB);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		ar = new int[N][N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				ar[i][j] = Integer.parseInt(st.nextToken());
		}
		divTeam(0, 0);
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
}