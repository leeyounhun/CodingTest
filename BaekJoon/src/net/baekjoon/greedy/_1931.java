package net.baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] ar = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++)
				ar[i][j] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar, (o1, o2) -> {
			return o1[1] == o2[1] ? o1[0] - o2[0] :  o1[1] - o2[1];
		});
		int time = 0;
		int cnt = 0;
		for (int i = 0; i < ar.length; i++)
			if (time <= ar[i][0]) {
				time = ar[i][1];
				cnt++;
			}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}