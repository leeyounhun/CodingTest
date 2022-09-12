package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.*;

public class _1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> deque = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++)
			deque.offer(i);
		int[] ar = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int index = 0;
		while (index < ar.length) {
			if (ar[index] == deque.peek()) {
				deque.poll();
				index++;
				continue;
			} else if (deque.indexOf(ar[index]) <= deque.size() / 2) {
				deque.offer(deque.poll());
				cnt++;
			} else {
				deque.offerFirst(deque.pollLast());
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}