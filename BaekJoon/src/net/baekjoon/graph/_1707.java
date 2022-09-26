package net.baekjoon.graph;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1707 {
	public static int[] visited;
	public static List<ArrayList<Integer>> graph;
	public static String ans;

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = 1;
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			for (int i = 0; i < graph.get(tmp).size(); i++) {
				if (visited[graph.get(tmp).get(i)] == 0) {
					queue.offer(graph.get(tmp).get(i));
					visited[graph.get(tmp).get(i)] = visited[tmp] * -1;
				} else if (visited[graph.get(tmp).get(i)] == visited[tmp])
					ans = "NO";
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			ans = "YES";
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			graph = new ArrayList<>();
			visited = new int[V + 1];
			for (int j = 0; j <= V; j++)
				graph.add(new ArrayList<Integer>());
			for (int j = 0; j < E; j++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				graph.get(u).add(v);
				graph.get(v).add(u);
			}
			for (int j = 1; j <= V; j++)
				if (visited[j] == 0)
					bfs(j);
			bw.write(ans + "\n");
		}
		bw.flush();
		bw.close();
	}
}