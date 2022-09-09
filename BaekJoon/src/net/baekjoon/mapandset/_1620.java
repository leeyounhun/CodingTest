package net.baekjoon.mapandset;

import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class _1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) {
			String input = br.readLine();
			map1.put(i, input);
			map2.put(input, i);
		}
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (!Character.isDigit(input.charAt(0)))
				sb.append(map2.get(input)).append("\n");
			else
				sb.append(map1.get(Integer.parseInt(input))).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}