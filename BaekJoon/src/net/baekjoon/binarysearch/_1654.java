package net.baekjoon.binarysearch;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		long[] ar = new long[K];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Long.parseLong(br.readLine());
		Arrays.sort(ar);
		long first = 0;
		long last = ar[ar.length - 1] + 1;
		while (first < last) {
			long mid = (first + last) / 2;
			long cnt = 0;
			for (long len : ar)
				cnt += (len / mid);
			if (cnt < N)
				last = mid;
			else
				first = mid + 1;
		}
		bw.write(first - 1 + "");
		bw.flush();
		bw.close();
	}
}