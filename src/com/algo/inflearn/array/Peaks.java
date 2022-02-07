package com.algo.inflearn.array;

import java.util.Scanner;

public class Peaks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
	}

	private static int solution(int n, int[][] arr) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true; // ºÀ¿ì¸®ÀÎÁö ÆÇº°
				for(int k = 0; k < 4; k++) { // 4 ¹æÇâ
					int nx = i + dx[k]; // Çà ÁÂÇ¥
					int ny = j + dy[k]; // ¿­ ÁÂÇ¥
					if((nx >= 0 && nx < n && ny >= 0 && ny < n) && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		return answer;
	}
	
}