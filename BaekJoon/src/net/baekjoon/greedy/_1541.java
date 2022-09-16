package net.baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
		int sum = 0;
		while (st2.hasMoreTokens())
			sum += Integer.parseInt(st2.nextToken());
		while (st.hasMoreTokens()) {
			int nextNum = 0;
			st2 = new StringTokenizer(st.nextToken(), "+");
			while (st2.hasMoreTokens())
				nextNum += Integer.parseInt(st2.nextToken());
			sum -= nextNum;
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}