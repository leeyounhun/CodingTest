package net.baekjoon.queueanddeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new ArrayDeque<>();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			for (int j = 0; j < n; j++)
				deque.offer(Integer.parseInt(st.nextToken()));
			boolean front_chk = true;
			boolean err_chk = false;
			for (int j = 0; j < p.length(); j++) {
				if (p.charAt(j) == 'R')
					front_chk = !front_chk;
				else if (p.charAt(j) == 'D') {
					if (deque.size() == 0) {
						err_chk = true;
						break;
					} else if (front_chk)
						deque.poll();
					else
						deque.pollLast();
				}
			}
			if (err_chk) {
				sb.append("error").append("\n");
				continue;
			} else {
				sb.append('[');
				if (deque.size() > 0) {
					if (front_chk) {
						sb.append(deque.poll());
						while (!deque.isEmpty())
							sb.append(',').append(deque.poll());
					} else {
						sb.append(deque.pollLast());
						while (!deque.isEmpty())
							sb.append(',').append(deque.pollLast());
					}
				}
				sb.append(']').append('\n');
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}