package com.algo.inflearn.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(solution(n, k));
	}

	private static int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		
		// 큐에 1~n까지 숫자 넣기
		for(int i = 1; i <= n; i++) Q.offer(i);
		
		while(!Q.isEmpty()) {
			for(int i = 1; i < k; i++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size() == 1) answer = Q.poll();
		}
		
		return answer;
	}

}
