package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.StringTokenizer;

public class _10866 {
	public static int[] deque;
	public static int first = -1;
	public static int last = -1;

	public static void push_front(int value) {
		if (first == last) {
			last++;
			deque[last] = value;
		} else if (first != -1) {
			for (int i = last; i >= first + 1; i--)
				deque[i + 1] = deque[i];
			deque[first + 1] = value;
			last++;
		} else {
			for (int i = last; i >= 0; i--)
				deque[i + 1] = deque[i];
			deque[0] = value;
			last++;
		}
	}

	public static void push_back(int value) {
		last++;
		deque[last] = value;
	}

	public static int pop_front() {
		if (last == first)
			return -1;
		else {
			first++;
			int tmp = deque[first];
			deque[first] = 0;
			return tmp;
		}

	}

	public static int pop_back() {
		if (last == first)
			return -1;
		else {
			int tmp = deque[last];
			deque[last] = 0;
			last--;
			return tmp;
		}
	}

	public static int size() {
		return last - first;
	}

	public static int empty() {
		if (last == first)
			return 1;
		else
			return 0;
	}

	public static int front() {
		if (last == first)
			return -1;
		else if (first == -1)
			return deque[0];
		else
			return deque[first + 1];
	}

	public static int back() {
		if (last == first)
			return -1;
		else
			return deque[last];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		deque = new int[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
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
