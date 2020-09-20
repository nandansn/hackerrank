package com.hackerrank;

import java.util.Stack;

public class MyStack {
	
	
	
	public static void main(String[] args) {
		
		Stack<Integer> newStack = new Stack<Integer>();
		
		int[] nums = {1,2,3,4};
		
		for (int i : nums) {
			newStack.push(i);
			
		}
		
		System.out.println(newStack);
	}
	
	

}
