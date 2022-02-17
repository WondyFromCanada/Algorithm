package com.algo.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class CranePuppetDraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i < m; i++) moves[i] = sc.nextInt();
		
		System.out.println(solution(board, moves));
	}

	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			// 행 크기 : board.length , 열 크기 : board[i].length
			for(int i = 0; i < board.length; i++) {
				// 0이 아닐 경우 인형 발견
				if(board[i][pos -1] != 0) {
					int tmp = board[i][pos -1];
					board[i][pos -1] = 0;
					// 스택에 상단에 있는 인형과 같은 건지 확인
					if(!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					// 인형을 발견하면 for문 벗어남
					break;
				}
			}
		}
		
		return answer;
	}

}