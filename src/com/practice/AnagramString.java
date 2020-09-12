package com.practice;

public class AnagramString {
	
	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAABBB"));
	}
	
	static int alternatingCharacters(String s) {
		
		char[] chars = s.toCharArray();
		
		int removeCount = 0;
		
		for (int i = 0; i < chars.length -1 ; i++) {
			int c = chars[i];
			int adj = chars[i+1];
			
			if (c == adj) {
				removeCount++;
			}
		}
		
		return removeCount;
		
	}

}
