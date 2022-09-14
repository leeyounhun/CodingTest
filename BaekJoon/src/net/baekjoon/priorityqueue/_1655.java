package net.baekjoon.priorityqueue;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class _1655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (maxQueue.size() == minQueue.size())
				maxQueue.offer(num);
			else
				minQueue.offer(num);
			if (maxQueue.size() != 0 && minQueue.size() != 0)
				if (maxQueue.peek() > minQueue.peek()) {
					minQueue.offer(maxQueue.poll());
					maxQueue.offer(minQueue.poll());
				}
			sb.append(maxQueue.peek()).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}