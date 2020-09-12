package com.practice;

public class HackerRank {
	
	public static void main(String[] args) {
		
		System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
	}
	
	static String hackerrankInString(String s) {
		
		int pos = 0;
		char[] hk = "hackerrank".toCharArray();
		
		if (s.equalsIgnoreCase("hackerrank")) {
			return "YES";
		} else {
			for (int i = 0; i < hk.length; i++) {
				pos = s.indexOf(hk[i], pos);
				if (pos < 0 ) {
					return "NO";
				} else {
					pos++;
				}
			}
			
			return "YES";
			
		}
		
		

    }

}
