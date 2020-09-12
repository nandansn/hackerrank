package com.hackerrank;

public class ShiftLeft {

	public static void main(String[] args) {
		
		shiftLeft(2, new int[] {1,2,3,4,5});	

	}
	
	public static void shiftLeft (int d, int a[]) {
		
		for (int i=0; i<d; i++) {
			int firstElement = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = firstElement;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	

}
