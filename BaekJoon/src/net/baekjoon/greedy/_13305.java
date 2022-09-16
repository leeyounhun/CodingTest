package net.baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] distance = new long[N];
		distance[0] = 0;
		long[] cost = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N; i++)
			distance[i] = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			cost[i] = Long.parseLong(st.nextToken());
		cost[N - 1] = 0;
		int index = 1;
		int cuser = 0;
		long sumDistance = 0;
		long sumCost = 0;
		while (index < N) {
			if (cost[cuser] > cost[index]) {
				for (int i = cuser + 1; i <= index; i++) {
					sumDistance += distance[i];
				}
				sumCost += sumDistance * cost[cuser];
				cuser = index;
				sumDistance = 0;
			} else
				index++;
		}
		bw.write(sumCost + "");
		bw.flush();
		bw.close();
	}
}