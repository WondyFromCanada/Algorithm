package com.algo.inflearn.string;

import java.util.Scanner;

public class Compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String answer = "";
		s = s + " "; // ArrayIndexOutOfBoundsException ¹æÁö
		int cnt = 1;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				cnt++;
			} else {
				answer += s.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}

}