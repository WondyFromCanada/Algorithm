package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HarshadNumber {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		System.out.println(solution(x));
	}
	
	public static boolean solution(int x) {
        int sum = 0;
        String s = String.valueOf(x);
        
        for(int i = 0; i < s.length(); i++) {
        	sum += s.charAt(i) - '0';
        }
        
        return (x % sum == 0);
    }

}
