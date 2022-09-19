package net.baekjoon.binarysearch;

import java.io.*;

public class _1300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(br.readLine());
		int k = Integer.parseInt(br.readLine());
		long first = 1;
		long last = N * N;
		while (first < last) {
			long mid = (first + last) / 2;
			long cnt = 0;
			for (int i = 1; i <= N; i++) {
				long per = mid / i;
				if (per > N)
					cnt += N;
				else
					cnt += per;
			}
			if (k <= cnt)
				last = mid;
			else
				first = mid + 1;
		}
		bw.write(first + "");
		bw.flush();
		bw.close();
	}
}