package net.baekjoon.mapandset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class _10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			String input = st.nextToken();
			if (!map.containsKey(input))
				map.put(input, 1);
			else
				map.put(input, map.get(input) + 1);
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			String input = st.nextToken();
			if (!map.containsKey(input))
				sb.append("0").append(" ");
			else
				sb.append(map.get(input)).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
