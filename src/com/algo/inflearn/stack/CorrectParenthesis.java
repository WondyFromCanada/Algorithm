package com.algo.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				// 스택에 아무것도 없는 경우
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		// ( 가 더 많을 경우
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}

}
