package net.baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2206 {
	static int n, m;
	static int[][] maze;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static Queue<Pair> que = new LinkedList<Pair>();
	static boolean[][][] visited;

	public static void BFS() {
		visited = new boolean[n][m][2];
		visited[0][0][0] = true;
		visited[0][0][1] = true;
		que.add(new Pair(0, 0, 1, 0));

		int ans = Integer.MAX_VALUE;
		while (!que.isEmpty()) {
			Pair node = que.poll();
			int nodex = node.x;
			int nodey = node.y;
			int nodelength = node.length;
			int nodewall = node.wall;

			if (nodex == n - 1 && nodey == m - 1) {
				ans = Math.min(ans, nodelength);
				continue;
			}

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (nodewall == 0 && !visited[nx][ny][0]) {
						if (maze[nx][ny] == 1) {
							que.add(new Pair(nx, ny, nodelength + 1, nodewall + 1));
							visited[nx][ny][1] = true;
						} else {
							que.add(new Pair(nx, ny, nodelength + 1, nodewall));
							visited[nx][ny][0] = true;
						}
					} else if (nodewall == 1 && !visited[nx][ny][1]) {
						if (maze[nx][ny] == 0) {
							que.add(new Pair(nx, ny, nodelength + 1, nodewall));
							visited[nx][ny][1] = true;
						}
					}

				}
			}
		}
		if (ans == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(ans);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");
		n = Integer.parseInt(NM[0]);
		m = Integer.parseInt(NM[1]);
		maze = new int[n][m];

		for (int i = 0; i < n; i++) {
			String mazeinfo = br.readLine();
			for (int j = 0; j < mazeinfo.length(); j++) {
				maze[i][j] = Integer.parseInt(mazeinfo.substring(j, j + 1));
			}
		}
		BFS();

	}

	public static class Pair {
		int x, y;
		int length;
		int wall;

		public Pair(int x, int y, int length, int wall) {
			this.x = x;
			this.y = y;
			this.length = length;
			this.wall = wall;
		}
	}
}