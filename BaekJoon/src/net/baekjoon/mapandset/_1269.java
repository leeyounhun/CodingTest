package net.baekjoon.mapandset;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			set1.add(input);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int input = Integer.parseInt(st.nextToken());
			set2.add(input);
		}
		int cnt = 0;
		for (int num : set1)
			if (!set2.contains(num))
				cnt++;
		for (int num : set2)
			if (!set1.contains(num))
				cnt++;
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
