package com.algo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String {

	public static void main(java.lang.String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
        
		/*
		 * if(s.length() == 4 || s.length() == 6) { for(int i = 0; i < s.length(); i++)
		 * { if(s.charAt(i) < '0' || s.charAt(i) > '9') { return false; } } } else
		 * return false;
		 * 
		 * return true;
		 */
		
		return s.matches("^[0-9]{4}|{6}$");
    }
}
