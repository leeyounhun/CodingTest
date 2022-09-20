package net.baekjoon.graph;

import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _24480 {
	public static List<ArrayList<Integer>> graph = new ArrayList<>();
	public static int[] visited;
	public static int cnt = 1;

	public static void dfs(int root) {
		visited[root] = cnt;
		for (int i = 0; i < graph.get(root).size(); i++) {
			if (visited[graph.get(root).get(i)] == 0) {
				cnt++;
				dfs(graph.get(root).get(i));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		visited = new int[N + 1];
		for (int i = 0; i <= N; i++)
			graph.add(new ArrayList<Integer>());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		for (int i = 1; i < graph.size(); i++)
			Collections.sort(graph.get(i), Collections.reverseOrder());
		dfs(R);
		for (int i = 1; i < visited.length; i++)
			sb.append(visited[i]).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}