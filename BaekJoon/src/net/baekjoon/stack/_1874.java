package net.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class _1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int value = 0;
		boolean chk = true;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			while (true) {
				if (num <= value)
					break;
				value++;
				stack.push(value);
				sb.append("+").append("\n");
			}
			if (num == stack.peek()) {
				stack.pop();
				sb.append("-").append("\n");
			} else {
				chk = false;
				break;
			}
		}
		if (chk)
			bw.write(sb.toString());
		else
			bw.write("NO");
		bw.flush();
		bw.close();
	}
}