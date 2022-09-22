package net.baekjoon.graph;

import java.io.*;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class _2606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		List<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i <= N; i++)
			graph.add(new ArrayList<Integer>());
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		queue.offer(1);
		visited[1] = true;
		int cnt = 0;
		while (!queue.isEmpty()) {
			int index = queue.poll();
			for (int i = 0; i < graph.get(index).size(); i++) {
				if (!visited[graph.get(index).get(i)]) {
					visited[graph.get(index).get(i)] = true;
					queue.offer(graph.get(index).get(i));
					cnt++;
				}
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
