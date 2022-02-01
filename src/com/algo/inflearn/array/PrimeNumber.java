package com.algo.inflearn.array;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(solution(n));
	}

	private static int solution(int n) {
		int answer = 0;
		int[] ch = new int[n + 1]; // 1번부터 n번까지이기 때문에
		for(int i = 2; i <= n; i++) {
			if(ch[i] == 0) { // 0이면 소수, 1이면 소수가 아님
				answer++;
				for(int j = i; j <= n; j += i) { // j는 i의 배수로 돌아야 함 
					ch[j] = 1;
				}
			}
		}
		return answer;
	}

}