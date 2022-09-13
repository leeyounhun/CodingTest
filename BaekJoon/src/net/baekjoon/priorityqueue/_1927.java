package net.baekjoon.priorityqueue;

import java.io.*;

public class _1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] heap = new int[N + 1];
		int index = 0;
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (index == 0) {
					sb.append("0").append("\n");
					continue;
				} else {
					sb.append(heap[1]).append("\n");
					heap[1] = heap[index];
					heap[index] = 0;
					index--;
					int cuser = 1;
					while (cuser * 2 <= index) {
						int child = cuser * 2;
						if (cuser * 2 + 1 <= index && heap[cuser * 2] > heap[cuser * 2 + 1])
							child += 1;
						if (heap[child] < heap[cuser]) {
							int tmp = heap[cuser];
							heap[cuser] = heap[child];
							heap[child] = tmp;
							cuser = child;
						} else
							break;
					}
				}
			} else {
				index++;
				heap[index] = x;
				int cuser = index;
				while (cuser / 2 >= 1) {
					if (heap[cuser / 2] > heap[cuser]) {
						int tmp = heap[cuser / 2];
						heap[cuser / 2] = heap[cuser];
						heap[cuser] = tmp;
						cuser /= 2;
					} else
						break;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}