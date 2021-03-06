package com.algo.inflearn.treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, k, arr));

	}

	private static int solution(int n, int k, int[] arr) {
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		// 3장을 뽑기 때문에 3중 for문
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return -1;
	}

}