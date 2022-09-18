package net.baekjoon.binarysearch;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _2110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] ar = new int[N];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(br.readLine());
		Arrays.sort(ar);
		int first = 0;
		int last = ar[ar.length - 1];
		while (first < last) {
			int mid = (first + last) / 2;
			int house = ar[0];
			int cnt = 1;
			for (int i = 1; i < ar.length; i++) {
				if (ar[i] - house >= mid) {
					cnt++;
					house = ar[i];
				}
			}
			if (cnt < C)
				last = mid;
			else
				first = mid + 1;
		}
		bw.write(first - 1 + "");
		bw.flush();
		bw.close();
	}
}