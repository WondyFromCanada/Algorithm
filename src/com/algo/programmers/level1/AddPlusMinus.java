package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class AddPlusMinus {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int absolutes[] = Pattern.compile(" ").splitAsStream(s).mapToInt(Integer::parseInt).toArray();
		boolean signs[] = new boolean[absolutes.length];
		
		for(int i = 0; i < signs.length; i++) {
			signs[i] = Boolean.parseBoolean(br.readLine());
		}
		
		System.out.println(solution(absolutes, signs));
	}

	private static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];				
			}
		}
		
		return answer;
	}

}