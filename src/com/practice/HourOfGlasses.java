package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class HourOfGlasses {
	
	static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
		System.out.println(result);
	}
	
	static int hourglassSum(int[][] arr) {
		
		int[] arrayOfSum = new int[16];
		
		int arrIndex = -1;
		
		
		
		int x = 0;
		int y = 0;
		
		int xMax = 4;
		int yMax = 4;
		
		for (x= 0; x < xMax; x++) {
			
			int j = 0;
			for (y = 0; y < yMax; y++) {
				j = y;
				int sum = 0;
				int i = x;
				for(; j < y+3; j++) {
					sum = sum + arr[i][j];
				}
				
				sum = sum + arr[i+1][y+1];
				
				j = y;
				i = x + 2;
				
				for(; j < y+3; j++) {
					sum = sum + arr[i][j];
				}
				
				arrIndex++;
				arrayOfSum[arrIndex] = sum;
				
			}
		}
		
		Arrays.sort(arrayOfSum);
		
		return arrayOfSum[arrayOfSum.length - 1];

    }
	

}
