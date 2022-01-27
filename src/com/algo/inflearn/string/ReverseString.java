package com.algo.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		
		for(String s : solution(n, str)) {
			System.out.println(s);
		}
	}

	private static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String s : str) {
			//answer.add(new StringBuilder(s).reverse().toString());
			
			char[] carr = s.toCharArray();
			int lt = 0, rt = s.length() - 1;
			
			while(lt < rt) {
				char tmp = carr[lt];
				carr[lt] = carr[rt];
				carr[rt] = tmp;
				lt++;
				rt--;
			}
			answer.add(String.valueOf(carr));
		}
		
		return answer;
	}

}
