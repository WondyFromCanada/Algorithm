package com.algo.inflearn.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = sc.next();
		
		System.out.println(solution(s, str));
	}

	private static String solution(String s, String str) {
		Queue<Character> Q = new LinkedList<>();
		
		// 필수과목 큐에 넣기
		for(char x : s.toCharArray()) Q.offer(x);
		
		for(char x : str.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		
		if(!Q.isEmpty()) return "NO";
		
		return "YES";
	}

}
