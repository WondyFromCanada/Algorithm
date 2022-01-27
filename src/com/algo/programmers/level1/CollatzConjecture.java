package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollatzConjecture {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(solution(num));
	}
	
	public static int solution(int num) {
		long n = num; //오버플로우 때문에 형변환
		
		for(int i = 0; i < 500; i++) {
			if(n == 1) return i;
			
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1; 
		}
		
		return -1;
        
    }

}
