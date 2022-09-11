package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.StringTokenizer;

public class _18258 {
	public static int[] queue;
	public static int first = -1;
	public static int last = -1;

	public static void push(int value) {
		last++;
		queue[last] = value;
	}

	public static int pop() {
		if (last == first)
			return -1;
		first++;
		int tmp = queue[first];
		queue[first] = 0;
		return tmp;
	}

	public static int size() {
		return last - first;
	}

	public static int empty() {
		if (first == last)
			return 1;
		else
			return 0;
	}

	public static int front() {
		if (first == last)
			return -1;
		else if (first == -1)
			return queue[0];
		return queue[first + 1];
	}

	public static int back() {
		if (first == last)
			return -1;
		return queue[last];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];
		for (int i = 0; i < queue.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
