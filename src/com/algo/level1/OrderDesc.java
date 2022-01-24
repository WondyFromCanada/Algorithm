package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrderDesc {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(solution(n));
	}

	private static long solution(long n) {
		String sarr[] = String.valueOf(n).split("");
		Arrays.sort(sarr);
		
		StringBuilder sb = new StringBuilder();
		for(String s : sarr) {
			sb.append(s);
		}
		
		return Long.parseLong(sb.reverse().toString());
	}

}
