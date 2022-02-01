package com.algo.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
			if(isPrime(arr[i])) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}

	private static boolean isPrime(int num) {
		if(num == 1) return false;
		
		for(int i = 2; i < (int) Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
	
}