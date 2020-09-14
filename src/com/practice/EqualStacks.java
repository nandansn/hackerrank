package com.practice;

import java.util.Stack;

public class EqualStacks {
	
	public static void main(String[] args) {
		
		int[] h1 = {3, 2, 1 ,1, 1,};
		int[] h2 = {4, 3, 2};
		int[] h3 = {1, 1, 4, 1};
		System.out.println(equalStacks(h1, h2, h3));
	}
	
	
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
        
		
		
		int totalHeightOfStack1 = 0;
		int totalHeightOfStack2 = 0;
		int totalHeightOfStack3 = 0;
		
		
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		
		
		
		
		for (int j = h1.length - 1; j >=0; j--) {
			totalHeightOfStack1 = totalHeightOfStack1 + h1[j];
			stack1.add(h1[j]);
		}
		
		for (int j = h2.length - 1; j >=0; j--) {
			totalHeightOfStack2 = totalHeightOfStack2 + h2[j];
			stack2.add(h2[j]);
		}
	
		
		for (int j = h3.length - 1; j >=0; j--) {
			totalHeightOfStack3 = totalHeightOfStack3 + h3[j];
			stack3.add(h3[j]);
		}
		
		if (totalHeightOfStack1 == totalHeightOfStack2 
				&&  totalHeightOfStack2 == totalHeightOfStack3) {
			return totalHeightOfStack1;
		}
		
	
		
		do {
			
			
			
			if (totalHeightOfStack1 > totalHeightOfStack2 
					|| totalHeightOfStack1 > totalHeightOfStack3) {
				while(totalHeightOfStack1 > totalHeightOfStack2 
						|| totalHeightOfStack1 > totalHeightOfStack3) {
				totalHeightOfStack1 = totalHeightOfStack1 - stack1.pop();
				}
				
			} 
			
			if (totalHeightOfStack2 > totalHeightOfStack1 
					|| totalHeightOfStack2 > totalHeightOfStack3) {
				
				while(totalHeightOfStack2 > totalHeightOfStack1 
						|| totalHeightOfStack2 > totalHeightOfStack3) {
				totalHeightOfStack2 = totalHeightOfStack2 - stack2.pop();
				}
				
			} 
			
			if (totalHeightOfStack3 > totalHeightOfStack2 
					|| totalHeightOfStack3 > totalHeightOfStack1) {
				
				while(totalHeightOfStack3 > totalHeightOfStack2 
					|| totalHeightOfStack3 > totalHeightOfStack1) {
				totalHeightOfStack3 = totalHeightOfStack3 - stack3.pop();
				}
				
				
			} 
			
			if (totalHeightOfStack1 == totalHeightOfStack2 
					&&  totalHeightOfStack2 == totalHeightOfStack3) {
				return totalHeightOfStack1;
			}
			
			
			
			
		} while(true);
		
		
		
		
		
		
		

    }

}
