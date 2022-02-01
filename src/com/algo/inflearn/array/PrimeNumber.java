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
		int[] ch = new int[n + 1]; // 1������ n�������̱� ������
		for(int i = 2; i <= n; i++) {
			if(ch[i] == 0) { // 0�̸� �Ҽ�, 1�̸� �Ҽ��� �ƴ�
				answer++;
				for(int j = i; j <= n; j += i) { // j�� i�� ����� ���ƾ� �� 
					ch[j] = 1;
				}
			}
		}
		return answer;
	}

}