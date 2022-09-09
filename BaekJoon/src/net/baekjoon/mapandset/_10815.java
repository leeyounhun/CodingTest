package net.baekjoon.mapandset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class _10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] ar = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(ar);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			int first = 0;
			int last = ar.length - 1;
			boolean chk = false;
			while (first <= last) {
				int mid = (last + first) / 2;
				if (num == ar[mid]) {
					chk = true;
					break;
				} else if (num > ar[mid])
					first = mid + 1;
				else
					last = mid - 1;
			}
			if (chk)
				sb.append("1").append(" ");
			else
				sb.append("0").append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}