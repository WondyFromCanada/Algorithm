package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HidePhoneNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String phone_number = br.readLine();
		
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
		StringBuilder answer = new StringBuilder(phone_number);
		
		for(int i = 0; i < phone_number.length() - 4; i++) {
			answer.setCharAt(i, '*');
		}
		
		return answer.toString();
	}

}
