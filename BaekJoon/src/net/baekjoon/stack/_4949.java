package net.baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class _4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		while (true) {
			String str = br.readLine();
			if (str.equals("."))
				break;
			boolean chk = true;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == '(' || c == '[')
					stack.push(c); 
				else if (c == ')' && (stack.empty() || stack.peek() != '(')) {
					chk = false;
					break;
				} else if (c == ']' && (stack.empty() || stack.peek() != '[')) {
					chk = false;
					break;
				} else if (c == ')' || c == ']')
					stack.pop();
			}
			if (!stack.empty())
				chk = false;
			if (chk)
				bw.write("yes" + "\n");
			else
				bw.write("no" + "\n");
			stack.clear();
		}
		bw.flush();
		bw.close();
	}
}
