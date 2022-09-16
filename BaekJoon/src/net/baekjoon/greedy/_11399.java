package net.baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] ar = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(ar);
		int sum = 0;
		int time = 0;
		for (int i = 0; i < N; i++) {
			time += ar[i];
			sum += time;
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
