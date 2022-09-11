package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++)
			queue.offer(i);
		sb.append("<");
		while (queue.size() > 1) {
			for (int i = 0; i < K - 1; i++)
				queue.offer(queue.poll());
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll());
		sb.append(">");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
