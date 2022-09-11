package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class _2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++)
			queue.offer(i);
		while (queue.size() != 1) {
			queue.remove();
			queue.offer(queue.poll());
		}
		bw.write(queue.poll() + "");
		bw.flush();
		bw.close();
	}
}
