package com.ds.programming.challenge;

import java.util.Stack;

public class JollyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isJollyNumber(new int[] {5,1,4,2-1,6}));

	}
	
	static String isJollyNumber(int[] n) {
		
		Stack<Integer> jollyStack = new Stack<Integer>();
		
		for (int i = 0; i < n.length -1; i++) {
			int diff = Math.abs(n[i] - n[i+1]);
			
			if (jollyStack.isEmpty()) {
				jollyStack.push(diff);
			} else {
				int headElement = jollyStack.peek();
				if (headElement - diff == 1) {
					jollyStack.pop();
					jollyStack.push(diff);
				} else {
					return "Not Jolly Number";
				}
			}
			
		}
		
		return "Jolly Number";
	}

}
