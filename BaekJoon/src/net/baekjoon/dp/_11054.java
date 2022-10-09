package net.baekjoon.dp;

import java.io.*;
import java.util.StringTokenizer;

public class _11054 {
	public static int ar[];
	public static int dpU[];
	public static int dpL[];

	public static int dpU(int N) {
		if (dpU[N] == 0) {
			dpU[N] = 1;
			for (int i = N - 1; i >= 0; i--)
				if (ar[i] < ar[N])
					dpU[N] = Math.max(dpU[N], dpU(i) + 1);
		}
		return dpU[N];
	}

	public static int dpL(int N) {
		if (dpL[N] == 0) {
			dpL[N] = 1;
			for (int i = N + 1; i < dpL.length; i++)
				if (ar[i] < ar[N])
					dpL[N] = Math.max(dpL[N], dpL(i) + 1);
		}
		return dpL[N];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N];
		dpU = new int[N];
		dpL = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < ar.length; i++) {
			dpU(i);
			dpL(i);
		}
		int max = 0;
		for (int i = 0; i < N; i++)
			max = Math.max(dpU[i] + dpL[i], max);
		bw.write(max - 1 + " ");
		bw.flush();
		bw.close();
	}
}