package net.baekjoon.mapandset;

import java.io.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> set = new HashSet<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			set.add(input);
		}
		ArrayList<String> ar = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (set.contains(input))
				ar.add(input);
		}
		Collections.sort(ar);
		sb.append(ar.size()).append("\n");
		for (String str : ar)
			sb.append(str).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
