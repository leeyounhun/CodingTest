package net.baekjoon.mapandset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class _14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++)
			map.put(br.readLine(), i);
		for (int i = 0; i < M; i++)
			if (map.containsKey(br.readLine()))
				cnt++;
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
