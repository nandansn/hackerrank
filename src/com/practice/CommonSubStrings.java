package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonSubStrings {
	
	public static void main(String[] args) {
		System.out.println(twoStrings("nanda","kumar"));
		
		
	}
	
	static String twoStrings(String s1, String s2) {
		
		Set<Character> s1Chars = new HashSet<Character>();
		
		char[] charsS1 = s1.toCharArray();
		char[] charsS2 = s2.toCharArray();
		
		if (s1.length() < s2.length()) {
			for (char c : charsS1) {
				s1Chars.add(c);
			}
			
			for (char c : charsS2) {
				if (s1Chars.contains(c)) {
					return "YES";
				}
			}
			return "NO";
		} else {
			for (char c : charsS2) {
				s1Chars.add(c);
			}
			
			for (char c : charsS1) {
				if (s1Chars.contains(c)) {
					return "YES";
				}
			}
			return "NO";
		}
				
		

	}
		


}
