package net.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class _9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			boolean chk = true;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == '(')
					stack.push(c);
				else if (stack.empty()) {
					chk = false;
					break;
				} else
					stack.pop();
			}
			if (!stack.empty())
				chk = false;
			if (chk)
				bw.write("YES" + "\n");
			else
				bw.write("NO" + "\n");
			stack.clear();
		}
		bw.flush();
		bw.close();
	}
}
