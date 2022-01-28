package com.algo.inflearn.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(tmp)) {
			return "YES";
		}
		
		return "NO";
		
		
		//String answer = "";
		
		/*
		 * s = s.toUpperCase(); int len = s.length(); for(int i = 0; i < len/2; i++) {
		 * if(s.charAt(i) != s.charAt(len - i -1)) { return "NO"; } } return "YES";
		 */
		
		/*
		 * char[] carr = s.toUpperCase().toCharArray(); int lt = 0, rt = s.length() - 1;
		 * while(lt < rt) { if(carr[lt] == carr[rt]) { lt++; rt--; answer = "YES"; }
		 * else { answer = "NO"; break; } }
		 */
		
	}

}