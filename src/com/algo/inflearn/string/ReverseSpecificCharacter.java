package com.algo.inflearn.string;

import java.util.Scanner;

public class ReverseSpecificCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String answer = "";
		char[] carr = s.toCharArray();
		int lt = 0, rt = s.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(carr[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(carr[rt])) {
				rt--;
			} else {
				char tmp = carr[lt];
				carr[lt] = carr[rt];
				carr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(carr);
		
		return answer;
	}

}