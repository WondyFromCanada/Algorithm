package com.algo.inflearn.string;

import java.util.Scanner;

public class Deduplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String answer = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(i == s.indexOf(s.charAt(i))) {
				answer += s.charAt(i);
			}
		}
		
		return answer;
	}

}