package com.algo.inflearn.string;

import java.util.Scanner;

public class PalindromeRegularExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			return "YES";
		}
		
		return "NO";
	}

}