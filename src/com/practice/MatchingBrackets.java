package com.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MatchingBrackets {
	
	public static void main(String[] args) {
		
		System.out.println(matcher("{}()[[((()(({{[]}{}{{[]}}{}}))))]]{{{{([{{{{}}}}])}}}}"));
	}
	
	private static String matcher(String s) {
		
		char[] brackets = s.toCharArray();
		
		Stack<Character> stackOfChars1 = new Stack<Character>();
		
		for (Character character : brackets) {
			if (character.equals('(') ) {
				stackOfChars1.push(character);
			}
			
			if (character.equals('[') ) {
				stackOfChars1.push(character);
			}
			
			if (character.equals('{') ) {
				stackOfChars1.push(character);
			}
			
			if (stackOfChars1.size() == 0) {
				return "NO";
			}
			
			if (character.equals(')')) {
				Character c2 = stackOfChars1.pop();
				if (c2 != '(') {
					return "NO";
				}
			}
			
			
			
			if (character.equals(']')) {
				Character c2 = stackOfChars1.pop();
				if (c2 != '[') {
					return "NO";
				}
			}
			
			if (character.equals('}')) {
				Character c2 = stackOfChars1.pop();
				if (c2 != '{') {
					return "NO";
				}
			}
		}
		
		
		
		/*
		 * if (stackOfChars1.size() == stackOfChars2.size()) {
		 * 
		 * int n = stackOfChars1.size();
		 * 
		 * for(int i=0; i < n; i++) { Character c = stackOfChars1.pop(); if
		 * (c.equals('(')) { Character c2 = stackOfChars2.pop(); if (c2 != ')') { return
		 * "NO"; } }
		 * 
		 * if (c.equals('[')) { Character c2 = stackOfChars2.pop(); if (c2 != ']') {
		 * return "NO"; } }
		 * 
		 * if (c.equals('{')) { Character c2 = stackOfChars2.pop(); if (c2 != '}') {
		 * return "NO"; } } }
		 * 
		 * if (stackOfChars1.size() + stackOfChars1.size() == 0) { return "YES"; } else
		 * { return "NO"; }
		 * 
		 * 
		 * 
		 * } else { return "NO"; }
		 */
		
		if (stackOfChars1.size() == 0) {
			return "YES";
		} else {
			return "NO";
		}
		
		
	}
}
