package net.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class _10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0)
				stack.pop();
			else
				stack.push(num);
		}
		for (int i : stack)
			sum += i;
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}