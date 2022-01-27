package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddDigits {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
	}

	public static int solution(int n) {
        int answer = 0;
        
        while(true) {
        	answer += n % 10;
        	if(n < 10) {
        		break;
        	}
        	
        	n /= 10;
        			
        }
        
        return answer;
    }
}