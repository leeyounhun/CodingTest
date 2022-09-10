package net.baekjoon.stack;

import java.io.*;
import java.util.StringTokenizer;

public class _10828 {
	public static int[] stack;
	public static int size = 0;

	public static void push(int num) {
		stack[size] = num;
		size++;
	}

	public static int pop() {
		if (size == 0)
			return -1;
		else {
			int tmp = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return tmp;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if (size == 0)
			return 1;
		else
			return 0;
	}

	public static int top() {
		if (size == 0)
			return -1;
		else {
			return stack[size - 1];
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		for (int i = 0; i < stack.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write(pop() + "\n");
				break;
			case "size":
				bw.write(size() + "\n");
				break;
			case "empty":
				bw.write(empty() + "\n");
				break;
			case "top":
				bw.write(top() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
