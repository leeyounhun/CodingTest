package net.baekjoon.stack;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class _17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ar.length; i++)
            ar[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < ar.length; i++){
            while(!stack.empty() && ar[stack.peek()] < ar[i])
                ar[stack.pop()] = ar[i];
            stack.push(i);
        }
        while(!stack.empty())
            ar[stack.pop()] = -1;
		for(int value : ar)
            sb.append(value).append(" ");
        bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}