package com.algo.inflearn.string;

import java.util.Scanner;

public class ExtractNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}

	private static int solution(String s) {
		return Integer.parseInt(s.replaceAll("[^0-9]", ""));
	}

}