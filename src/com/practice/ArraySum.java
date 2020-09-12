package com.practice;

public class ArraySum {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		System.out.println(sum(a.length, a));
	}
	
	public static int sum(int n, int[] a) {
		
		if (n == 0) {
			return 0; 
		} else {
			n = n - 1;
			return a[n] + sum(n, a);
		}
	}

}
