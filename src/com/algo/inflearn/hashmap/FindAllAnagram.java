package com.algo.inflearn.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(solution(s, t));

	}

	private static int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> smap = new HashMap<>();
		HashMap<Character, Integer> tmap = new HashMap<>();
		
		for(char x : t.toCharArray()) {
			tmap.put(x, tmap.getOrDefault(x, 0) + 1);
		}
		
		//첫 번째 윈도루 세팅
		for(int i = 0; i < t.length() - 1; i++) {
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		for(int rt = t.length() - 1; rt < s.length(); rt++) {
			smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0) + 1);
			if(smap.equals(tmap)) answer++;
			smap.put(s.charAt(lt), smap.getOrDefault(s.charAt(lt), 0) - 1);
			if(smap.get(s.charAt(lt)) == 0) {
				smap.remove(s.charAt(lt));
			}
			lt++;
		}
		return answer;
	}

}