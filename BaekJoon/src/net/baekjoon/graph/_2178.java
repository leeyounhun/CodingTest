package net.baekjoon.graph;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class _2178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];
		int[][] visited = new int[N][M];
		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			for (int j = 0; j < M; j++)
				graph[i][j] = num.charAt(j) - '0';
		}

		int[] moveX = { 1, 0, -1, 0 };
		int[] moveY = { 0, 1, 0, -1 };

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { 0, 0 });
		visited[0][0] = 1;

		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M)
					if (visited[nextX][nextY] == 0 && graph[nextX][nextY] == 1) {
						visited[nextX][nextY] = visited[x][y] + 1;
						queue.offer(new int[] { nextX, nextY });
					}
			}
		}
		bw.write(visited[N - 1][M - 1] + "");
		bw.flush();
		bw.close();
	}
}
