package com.practice;

import java.util.Arrays;

public class MinimumBribes {
	
	public static void main(String[] args) {
		minimumBribes(new int[] {1, 2, 5, 3, 7, 8, 6, 4});
	}
	
	static void minimumBribes(int[] q) {
		
		int reorderBribeCount = 0;
		boolean printFlag = true;
		
		int[] arrayNonBribed = Arrays.copyOf(q,q.length);
		
		Arrays.parallelSort(arrayNonBribed);
		
		for (int i =0; i<q.length; i++) {
			if (q[i] == arrayNonBribed[i]) {
				continue;
			} else {
				int originalPosOfBribedElement = q[i] - 1;
				int currentPosOfBribedElement = i;
				
				int bribeCountLimitPerPerson =0;
				if ( currentPosOfBribedElement < originalPosOfBribedElement) {
					for (int j = originalPosOfBribedElement; j > currentPosOfBribedElement; j--) {
							int temp = arrayNonBribed[originalPosOfBribedElement];
							arrayNonBribed[originalPosOfBribedElement] = arrayNonBribed[originalPosOfBribedElement - 1];
							arrayNonBribed[originalPosOfBribedElement - 1] = temp;
							originalPosOfBribedElement = originalPosOfBribedElement - 1;
							++bribeCountLimitPerPerson;
							reorderBribeCount = 1 + reorderBribeCount;
					}
				}
				
				if (bribeCountLimitPerPerson > 2) {
					printFlag = false;
					break;
				}
		}
		
		
		
		
		
		
		
		
		

    }
		
		if (printFlag) {
			System.out.println(reorderBribeCount);
		} else {
			System.out.println("Too chaotic");
		}

	}
	}
