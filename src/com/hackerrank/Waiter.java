package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Waiter {

	public static void main(String[] args) {
		//System.out.println(primeNumberList(5));
		
		waiter(new int[] {3, 3, 4, 4, 9}, 2);
		

	}
	
	static List<Integer> primeNumberList(int iteration) {
		
		List<Integer> primeList = new ArrayList<Integer>();
		
		
		int startPrime = 2;
		
		if (iteration == 1) {
			primeList.add(startPrime);
		} else {
			int numStart = 2;
			for (int i = 0; i < iteration; i++) {
				int divNum = 2;
				do {
					if (divNum == numStart) {
						startPrime = divNum;
						primeList.add(startPrime);
						numStart = numStart + 1;
						break;
					}
					 if ((numStart % divNum) == 0) { numStart = numStart + 1;}
					 ++divNum;
				} 
				while(true);
			}
		}
		
		
		
		
		return primeList;
		
	}
	
	
	static int[] waiter(int[] number, int q) {
        
		List<Integer> primeList = primeNumberList(q);
		
		Stack<Integer> mainStack = new Stack<Integer>();
		Stack<Integer> newArranged = new Stack<Integer>();
		
		int[] newArrangedArray = new int[number.length];
		
		for (int integer : number) {
			mainStack.push(integer);
		}
		
		int j =0;
		int k =0;
		
		for (Integer primeNumber : primeList) {
			
			
			for (int i=mainStack.size() - 1; i >=0 ; i--) {
				
				if (mainStack.get(i) % primeNumber == 0) {
					newArranged.push(mainStack.remove(i));
					++j;
				}
			}
			
			
			
			while(!newArranged.isEmpty()) {
				newArrangedArray[k] = newArranged.pop();
				k++;
			}
			
		}
		
		if (!mainStack.isEmpty()) {
			
			for (int i=mainStack.size() -1 ; i >= 0; i--) {
				
				newArranged.push(mainStack.remove(i));
				++j;
			}
			
			
			
			while(!newArranged.isEmpty()) {
				newArrangedArray[k] = newArranged.pop();
				k++;
			}
			
		}
		
		return null;

    }

}
