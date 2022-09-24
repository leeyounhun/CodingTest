package net.baekjoon.graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class _7576 {
	public static int[][] map;
	public static int[][] visited;

	public static void bfs(ArrayList<int[]> roots) {
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < roots.size(); i++) {
			queue.offer(new int[] { roots.get(i)[0], roots.get(i)[1] });
			visited[roots.get(i)[0]][roots.get(i)[1]] = 1;
		}
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			int[] moveX = new int[] { 1, 0, -1, 0 };
			int[] moveY = new int[] { 0, 1, 0, -1 };
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length
						&& visited[nextX][nextY] == 0 && map[nextX][nextY] != -1) {
					queue.offer(new int[] { nextX, nextY });
					visited[nextX][nextY] = visited[x][y] + 1;
				}
			}
		}
	}

	public static int chkMap() {
		boolean chk = true;
		int max = 1;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (visited[i][j] == 0 && map[i][j] != -1) {
					chk = false;
					break;
				} else if (visited[i][j] > max)
					max = visited[i][j];
			}
		}
		if (chk)
			return max - 1;
		else
			return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new int[N][M];
		ArrayList<int[]> roots = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1)
					roots.add(new int[] { i, j });
			}
		}
		bfs(roots);
		int cnt = chkMap();
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
