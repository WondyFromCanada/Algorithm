package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringToInt {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		return Integer.parseInt(s);
	}
}