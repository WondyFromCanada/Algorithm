package com.algo.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			} else if(x == ')') {
				stack.pop();
			} else {
				if(stack.isEmpty()) answer += x;
			}
		}
		
		
		return answer;
	}

}