package com.algo.inflearn.string;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
			else answer += Character.toLowerCase(c);
		}
		return answer;
	}

}
