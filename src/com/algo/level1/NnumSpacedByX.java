package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.LongStream;

public class NnumSpacedByX {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(Arrays.toString(solution(x, n)));
	}
	
	public static long[] solution(int x, int n) {
        return LongStream.iterate(x, i -> i + x).limit(n).toArray();
    }

}
