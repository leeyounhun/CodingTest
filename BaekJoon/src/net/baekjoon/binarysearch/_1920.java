package net.baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A.length; i++)
			A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			int first = 0;
			int last = A.length - 1;
			boolean chk = false;
			while (first <= last) {
				int mid = (last + first) / 2;
				if (num == A[mid]) {
					chk = true;
					break;
				} else if (num > A[mid])
					first = mid + 1;
				else
					last = mid - 1;
			}
			if (chk)
				sb.append(1).append("\n");
			else
				sb.append(0).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
