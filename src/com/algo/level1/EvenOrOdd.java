package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		System.out.println(solution(num));
	}

	public static String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}

}
