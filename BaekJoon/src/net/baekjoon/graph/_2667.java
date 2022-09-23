package net.baekjoon.graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class _2667 {
	public static int[][] map;
	public static boolean[][] visited;
	public static List<Integer> ar = new ArrayList<>();

	public static void bfs(int[] root) {
		Queue<int[]> queue = new LinkedList<>();
		int cnt = 1;
		queue.offer(root);
		visited[root[0]][root[1]] = true;
		int[] moveX = new int[] { 1, 0, -1, 0 };
		int[] moveY = new int[] { 0, 1, 0, -1 };
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length && map[nextX][nextY] == 1
						&& !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					queue.offer(new int[] { nextX, nextY });
					cnt++;
				}
			}
		}
		ar.add(cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < N; j++)
				map[i][j] = tmp.charAt(j) - '0';
		}
		int cnt = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (map[i][j] == 1 && !visited[i][j]) {
					bfs(new int[] { i, j });
					cnt++;
				}
		sb.append(cnt).append("\n");
		Collections.sort(ar);
		for (int num : ar)
			sb.append(num).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}