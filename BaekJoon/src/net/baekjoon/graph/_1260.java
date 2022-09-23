package net.baekjoon.graph;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1260 {
	public static List<ArrayList<Integer>> graph = new ArrayList<>();
	public static StringBuilder sb = new StringBuilder();
	public static boolean[] visitedDfs;
	public static boolean[] visitedBfs;	

	public static void dfs(int root) {
		Stack<Integer> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			int tmp = stack.pop();
			if (!visitedDfs[tmp]) {
				sb.append(tmp).append(" ");
				visitedDfs[tmp] = true;
				for (int i = graph.get(tmp).size() - 1; i >= 0; i--)
					stack.push(graph.get(tmp).get(i));
			}
		}
	}

	public static void bfs(int root) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(root);
		visitedBfs[root] = true;
		sb.append(root).append(" ");
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			for (int i = 0; i < graph.get(tmp).size(); i++)
				if (!visitedBfs[graph.get(tmp).get(i)]) {
					queue.offer(graph.get(tmp).get(i));
					visitedBfs[graph.get(tmp).get(i)] = true;
					sb.append(graph.get(tmp).get(i)).append(" ");
				}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		visitedDfs = new boolean[N + 1];
		visitedBfs = new boolean[N + 1];

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
			Collections.sort(graph.get(i));

		dfs(V);
		sb.append("\n");
		bfs(V);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}