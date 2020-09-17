package com.practice;

import java.util.Arrays;

public class MinimumBribes {
	
	public static void main(String[] args) {
		minimumBribes(new int[] {2,1,5,3,4});
	}
	
	static void minimumBribes(int[] q) {
		
		int reorderBribeCount = 0;
		boolean printFlag = true;
		
		for (int i=0; i<q.length; i++) {
			
			int originalPosition = q[i] - 1;
			
			int bribedPosition = i;
			
			int diffInPosition = originalPosition - bribedPosition;
			
			if (diffInPosition == 0) {
				continue;
			}
			
			if (diffInPosition >= -2 && diffInPosition <= 2) {
				reorderBribeCount = Math.abs(diffInPosition) + reorderBribeCount;
				//i = originalPosition;
			} else {
				System.out.println("Too chaotic");
				printFlag = false;
				break;
			}
			
		}
		
		if (printFlag) {
			System.out.println(reorderBribeCount);
		}
		
		

    }


}
