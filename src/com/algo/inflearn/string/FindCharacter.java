package com.algo.inflearn.string;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.print(solution(str, c));
	}

	private static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for(char ch : str.toCharArray()) {
			if(ch == c) answer++;
		}
		
		return answer;
	}

}
