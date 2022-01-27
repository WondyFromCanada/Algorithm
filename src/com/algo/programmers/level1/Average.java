package com.algo.programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Average {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int arr[] = Pattern.compile(" ").splitAsStream(s).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(solution(arr));
	}
	
	public static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}

}
