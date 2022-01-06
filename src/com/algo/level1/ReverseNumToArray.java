package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseNumToArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(Arrays.toString(solution(n)));
	}

	public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        int[] answer = new int[sb.length()];
       
        for(int i = 0; i < sb.length(); i++) {
        	answer[i] = sb.charAt(i) - '0';
        }
        
        return answer;
    }
}
