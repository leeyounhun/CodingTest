package net.baekjoon.graph;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1012 {
	public static int[][] map;
	public static boolean[][] visited;

	public static void bfs(int[] root) {
		Queue<int[]> queue = new LinkedList<>();
		visited[root[0]][root[1]] = true;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			int[] moveX = { 1, 0, -1, 0 };
			int[] moveY = { 0, 1, 0, -1 };
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length && map[nextX][nextY] == 1
						&& !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					queue.offer(new int[] { nextX, nextY });
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 0;
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visited = new boolean[N][M];
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				map[v][u] = 1;
			}
			for (int j = 0; j < N; j++)
				for (int k = 0; k < M; k++)
					if (map[j][k] == 1 && !visited[j][k]) {
						bfs(new int[] { j, k });
						cnt++;
					}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
	}
}