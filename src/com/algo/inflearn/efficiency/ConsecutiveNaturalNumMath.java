package com.algo.inflearn.efficiency;

import java.util.Scanner;

public class ConsecutiveNaturalNumMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		int answer = 0, cnt = 1;
		// cnt = 연속된 자연수의 개수
		n--;
		
		while(n > 0) {
			cnt++;
			n -= cnt;
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}

}
