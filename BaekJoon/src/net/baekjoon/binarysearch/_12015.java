package net.baekjoon.binarysearch;

import java.io.*;
import java.util.StringTokenizer;

public class _12015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] ar = new int[N];
		int[] result = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		result[0] = ar[0];
		int index = 1;
		for (int i = 1; i < ar.length; i++) {
			if (result[index - 1] < ar[i]) {
				result[index] = ar[i];
				index++;
			} else {
				int left = 0;
				int right = index - 1;
				while (left < right) {
					int mid = (left + right) / 2;
					if (result[mid] >= ar[i])
						right = mid;
					else
						left = mid + 1;
				}
				result[left] = ar[i];
			}
		}
		bw.write(index + "");
		bw.flush();
		bw.close();
	}
}