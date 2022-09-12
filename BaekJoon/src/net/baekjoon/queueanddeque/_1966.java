package net.baekjoon.queueanddeque;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Queue<int[]> queue = new LinkedList<>();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				queue.offer(new int[] { j, Integer.parseInt(st.nextToken()) });
			while (true) {
				int[] ar = queue.poll();
				boolean chk = true;
				for (int q[] : queue)
					if (ar[1] < q[1]) {
						chk = false;
						break;
					}
				if (chk) {
					cnt++;
					if (ar[0] == M)
						break;
				} else
					queue.offer(ar);
			}
			sb.append(cnt).append("\n");
			queue.clear();
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
