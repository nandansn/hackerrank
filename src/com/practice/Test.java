package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
		Parser parser = new Parser();
		parser.isBalanced("{}()");
		Float f1 = new Float("3.0");
		System.out.println(f1.intValue() + f1.byteValue() +f1.doubleValue());
		
		int i = 010;
		int j = 07;
		
		System.out.println(i + " " + j);
	}
	
	class MyComparator{

		
		
		public boolean compare(int a, int b) {
			// TODO Auto-generated method stub
			return a == b ? true : false;
		}
		
		public boolean compare(String a, String b) {
			// TODO Auto-generated method stub
			return a.equals(b);
		}
		
		public boolean compare(int a[], int b[]) {
			// TODO Auto-generated method stub
			return	Arrays.equals(a, b);
		}
		
		
	}

}
class Parser {
	
	public boolean isBalanced(String s) {

        char[] chars = s.toCharArray();
        
        if (s.length() % 2 != 0) {
        	return false;
        }
        
        Stack<Character> stackChar = new Stack<>();
        
        for (char c : chars) {
        	
        	if (c == '{') {
        		stackChar.push(c);
        	}
        	
        	if (c == '(') {
        		stackChar.push(c);
        	}
        	
        	if (c == '}' && !stackChar.empty()) {
        		if (stackChar.pop() !=  '{'){
        			return false;
        		}
        	}
        		
        	
        	if (c == ')' && !stackChar.empty()) {
        		if (stackChar.pop() !=  '('){
        			return false;
        		}
        	}
			
		}
        
        if (stackChar.empty()) {
        	return true;
        }
        
    }
	
}
