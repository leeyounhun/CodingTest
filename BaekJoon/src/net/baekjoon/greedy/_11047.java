package net.baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] ar = new int[N];
		for (int i = 0; i < N; i++)
			ar[i] = Integer.parseInt(br.readLine());
		int index = ar.length - 1;
		int cnt = 0;
		while (K != 0) {
			if (ar[index] <= K) {
				K -= ar[index];
				cnt++;
			} else {
				index--;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}