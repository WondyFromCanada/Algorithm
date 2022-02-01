package com.algo.inflearn.array;

import java.util.Scanner;

public class VisibleStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(solution(n, arr));
	}

	private static int solution(int n, int[] arr) {
		int answer = 1; // 맨 앞에 있는 학생은 무조건 보임
		int max = arr[0];
		
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}

}