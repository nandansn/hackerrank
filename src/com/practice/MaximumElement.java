package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement  {
	
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int numberOFInputs = Integer.parseInt(scanner.nextLine());
		
		Stack<Element> elementStack = new Stack<Element>();
		
		
		int maximum = 0;
		
		for (int i = 0; i < numberOFInputs; i++) {
			
			
			
			String[] choiceAndNum = scanner.nextLine().split(" ");
			
			int choice = Integer.parseInt(choiceAndNum[0]);
			
			if (choice == 1) {
				int numberToInsert = Integer.parseInt(choiceAndNum[1]);
				maximum = Math.max(numberToInsert, maximum); 
					elementStack.push(new MaximumElement.Element(numberToInsert, maximum));
					
			}
			
		
			
			if (choice == 2) {
				
				
				if (!elementStack.isEmpty()) {
					
					elementStack.pop();
					
				
				} 
				
				if (elementStack.isEmpty()) {
					maximum = 0;
				} else {
					maximum =  elementStack.peek().maximumValue;
							
				}
				
				
			}
			
			
		  if (choice == 3) {
				 System.out.println(elementStack.peek().maximumValue);
		  }
		
		}
		
		  //for (Integer integer : elementStack) { System.out.println(integer); }
		 
		
		
		
	}
	
	
	static class Element {
		
		int value;
		int maximumValue;
		
		public Element(int value, int maximumValue) {
			
			this.maximumValue = value;
			this.maximumValue = maximumValue;
		}
		
	}

	
	
	

}
