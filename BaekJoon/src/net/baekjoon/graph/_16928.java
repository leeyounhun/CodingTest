package net.baekjoon.graph;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _16928 {
	public static int[] map = new int[101];
	public static boolean[] visited = new boolean[101];

	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		visited[1] = true;
		map[1] = 0;
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			if (tmp == 100)
				break;
			for (int i = 1; i < 7; i++) {
				int next = tmp + i;
				if (next < 101 && !visited[next]) {
					if (map[next] != 0) {
						if (!visited[map[next]]) {
							visited[next] = true;
							queue.offer(map[next]);
							map[map[next]] = map[tmp] + 1;
						}
					} else {
						visited[next] = true;
						queue.offer(next);
						map[next] = map[tmp] + 1;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		bfs();
		bw.write(map[100] + "");
		bw.flush();
		bw.close();
	}
}
