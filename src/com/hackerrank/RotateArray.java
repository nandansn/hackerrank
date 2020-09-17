package com.hackerrank;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		
		rotateArray(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}
	
	static void rotateArray(int[][] a) {
		int rowLength = a.length;
		int colLength = a[0].length;
		
		int[][] rotatedArray = new int[rowLength][colLength];
		
		int rArrayRowPos =0;
		int rArrayColPos =0;
		
		
		for(int col= 0; col < colLength; col++) {
			
			rArrayColPos = 0;
			for(int row = rowLength - 1; row >= 0; row--) {
				
				
				
					rotatedArray[rArrayRowPos][rArrayColPos] = a[row][col];
					
					rArrayColPos = rArrayColPos + 1;
				
			}
			
			rArrayRowPos = rArrayRowPos + 1;
			
			
		
		}
		
		System.out.println("stop");
	}

}
