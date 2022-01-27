package com.algo.inflearn.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindWordInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			int len = s.length();
			if(len > m) {
				m = len;
				answer = s;
			}
		}

		return answer;
	}

}
