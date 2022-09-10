package net.baekjoon.mapandset;

import java.io.*;
import java.util.HashSet;

public class _11478{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < S.length(); i++)
            for(int j = i + 1; j < S.length() + 1; j++)
                set.add(S.substring(i, j));
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
