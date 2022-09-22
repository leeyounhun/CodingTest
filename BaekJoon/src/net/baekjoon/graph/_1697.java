package net.baekjoon.graph;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class _1697 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		int[] visited = new int[100001];

		queue.offer(N);
		visited[N] = 0;
		while (!queue.isEmpty()) {
			int X = queue.poll();
			if (X == K)
				break;
			int[] nextX = new int[] { X + 1, X - 1, X * 2 };
			for (int i = 0; i < nextX.length; i++) {
				if (nextX[i] >= 0 && nextX[i] <= 100000 && visited[nextX[i]] == 0) {
					visited[nextX[i]] = visited[X] + 1;
					queue.offer(nextX[i]);
				}
			}
		}
		bw.write(visited[K] + "");
		bw.flush();
		bw.close();
	}
}