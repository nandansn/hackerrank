package com.practice;

import java.util.Stack;

public class MatchingBrackets {
	
	public static void main(String[] args) {
		
		System.out.println(matcher("((()"));
	}
	
	private static String matcher(String s) {
		
		char[] brackets = s.toCharArray();
		
		Stack<Character> stackOfChars = new Stack<Character>();
		
		for (Character character : brackets) {
			if (character.equals('(')) {
				stackOfChars.push(character);
			}
			
			if (character.equals(')')) {
				stackOfChars.pop();
			}
		}
		
		if (stackOfChars.size() == 0) {
			return "VALID";
		} else {
			return "INVALID";
		}
		
		
		
	}
}
