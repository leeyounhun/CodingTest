package net.baekjoon.graph;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _7562 {
	public static int[][] map;
	public static int[][] visited;

	public static int bfs(int[] root, int[] leaf) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(root);
		visited[root[0]][root[1]] = 0;
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			if (x == leaf[0] && y == leaf[1])
				break;
			int[] moveX = new int[] { -2, -2, -1, -1, 1, 1, 2, 2 };
			int[] moveY = new int[] { 1, -1, 2, -2, 2, -2, 1, -1 };
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length
						&& visited[nextX][nextY] == 0) {
					queue.offer(new int[] { nextX, nextY });
					visited[nextX][nextY] = visited[x][y] + 1;
				}
			}
		}
		return visited[leaf[0]][leaf[1]];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int I = Integer.parseInt(br.readLine());
			map = new int[I][I];
			visited = new int[I][I];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] root = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			st = new StringTokenizer(br.readLine());
			int[] leaf = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			sb.append(bfs(root, leaf)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
