package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringDesc {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String sarr[] = s.split("");
		Arrays.sort(sarr);
		StringBuilder sb = new StringBuilder();
		
		for(String st : sarr) {
			sb.append(st);
		}
		
		return sb.reverse().toString();
	}

}