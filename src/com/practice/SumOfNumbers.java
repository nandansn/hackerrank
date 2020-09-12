package com.practice;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,5};
		
		System.out.println(sumOfArray(a, 0, a.length-1));
	}
	
	static int sumOfArray(int[] a, int i, int j) {
		
		if (i == j) {
			return a[i];
		} else {
			
			int mid = (i + j) / 2;
			
			int lsum = sumOfArray(a, i, mid);
			int rsum = sumOfArray(a, mid+1, j);
			
			return lsum + rsum;
		}
		
		
		
	}

}
