package net.baekjoon.binarysearch;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] ar = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(ar);
		int first = 0;
		int last = ar[ar.length - 1];
		while (first < last) {
			int mid = (first + last) / 2;
			long length = 0;
			for (int len : ar)
				if (len - mid > 0)
					length += (len - mid);
			if (length >= M)
				first = mid + 1;
			else
				last = mid;
		}
		bw.write(first - 1 + "");
		bw.flush();
		bw.close();
	}
}