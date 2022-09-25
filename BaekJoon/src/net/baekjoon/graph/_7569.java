package net.baekjoon.graph;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _7569 {
	public static int[][][] box;

	public static void bfs(ArrayList<int[]> roots) {
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < roots.size(); i++)
			queue.offer(new int[] { roots.get(i)[0], roots.get(i)[1], roots.get(i)[2] });
		while (!queue.isEmpty()) {
			int[] tmp = queue.poll();
			int x = tmp[0];
			int y = tmp[1];
			int z = tmp[2];
			int[] moveX = new int[] { 1, -1, 0, 0, 0, 0 };
			int[] moveY = new int[] { 0, 0, 1, -1, 0, 0 };
			int[] moveZ = new int[] { 0, 0, 0, 0, 1, -1 };
			for (int i = 0; i < moveX.length; i++) {
				int nextX = x + moveX[i];
				int nextY = y + moveY[i];
				int nextZ = z + moveZ[i];
				if (nextX >= 0 && nextY >= 0 && nextZ >= 0 && nextX < box.length && nextY < box[0].length
						&& nextZ < box[0][0].length && box[nextX][nextY][nextZ] == 0) {
					queue.offer(new int[] { nextX, nextY, nextZ });
					box[nextX][nextY][nextZ] = box[x][y][z] + 1;
				}
			}
		}
	}

	public static int chkBox() {
		int max = 1;
		for (int i = 0; i < box.length; i++)
			for (int j = 0; j < box[i].length; j++)
				for (int k = 0; k < box[i][j].length; k++) {
					if (box[i][j][k] == 0)
						return -1;
					else if (max < box[i][j][k])
						max = box[i][j][k];
				}
		return max - 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		box = new int[H][N][M];
		ArrayList<int[]> roots = new ArrayList<>();
		for (int i = 0; i < H; i++)
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					box[i][j][k] = Integer.parseInt(st.nextToken());
					if (box[i][j][k] == 1)
						roots.add(new int[] { i, j, k });
				}
			}
		bfs(roots);
		bw.write(chkBox() + "");
		bw.flush();
		bw.close();
	}
}
