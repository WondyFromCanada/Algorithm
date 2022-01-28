package com.algo.inflearn.string;

import java.util.Scanner;

public class ShortestDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		for(int x : solution(s, c)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(String s, char c) {
		int[] answer = new int[s.length()];
  		int p = 1000;
		
  		for(int i = 0; i < s.length(); i++) {
  			if(s.charAt(i) != c) {
  				p++;
  				answer[i] = p;
  			} else {
  				p = 0;
  				answer[i] = 0;
  			}
  		}
  		
  		for(int i = s.length() - 1; i >= 0; i--) {
  			if(s.charAt(i) != c) {
  				p++;
  				answer[i] = Math.min(answer[i], p);
  			} else {
  				p = 0;
  			}
  		}
  		
		return answer;
	}

}