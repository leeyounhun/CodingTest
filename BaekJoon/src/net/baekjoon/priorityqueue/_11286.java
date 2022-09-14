package net.baekjoon.priorityqueue;

import java.io.*;

public class _11286 {
	public static int[] heap;
	public static int index = 0;

	public static int poll(int value) {
		if (index == 0) {
			return 0;
		}
		int result = heap[1];
		heap[1] = heap[index];
		heap[index] = 0;
		index--;
		downner();
		return result;
	}

	public static void downner() {
		int cuser = 1;
		while (cuser * 2 <= index) {
			int child = cuser * 2;
			if (rightChk(child))
				child += 1;
			if ((Math.abs(heap[child]) < Math.abs(heap[cuser]))
					|| (Math.abs(heap[child]) == Math.abs(heap[cuser]) && heap[child] < heap[cuser])) {
				int tmp = heap[child];
				heap[child] = heap[cuser];
				heap[cuser] = tmp;
				cuser = child;
			} else
				break;
		}
	}

	public static boolean rightChk(int child) {
		if (child + 1 <= index)
			if ((Math.abs(heap[child + 1]) < Math.abs(heap[child]))
					|| (Math.abs(heap[child + 1]) == Math.abs(heap[child]) && heap[child + 1] < heap[child]))
				return true;
		return false;
	}

	public static void offer(int value) {
		index++;
		heap[index] = value;
		upper();
	}

	public static void upper() {
		int cuser = index;
		while (cuser / 2 >= 1) {
			int parents = cuser / 2;
			if ((Math.abs(heap[cuser]) < Math.abs(heap[parents]))
					|| ((Math.abs(heap[cuser]) == Math.abs(heap[parents]) && heap[cuser] < heap[parents]))) {
				int tmp = heap[parents];
				heap[parents] = heap[cuser];
				heap[cuser] = tmp;
				cuser = parents;
			} else
				break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		heap = new int[N];
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0)
				sb.append(poll(x)).append("\n");
			else
				offer(x);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}