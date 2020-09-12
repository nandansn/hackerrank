package com.practice;

public class BinarySearch {
	
	public static void main(String[] args) {
		int n = 24444444;
		int[] a = {2,3,4,6,24444444};
		System.out.println(binarySearch(n, a, 0, a.length-1));
	}
	
	static String binarySearch(int n, int a[], int i, int j) {
		
		
		
		if (j < 0 || i > a.length - 1) {
			return "Not Found";
		} else {
		
		int mid = (i + j) / 2;
			
		if (a[mid] == n) {
				return "Found";
		} else if (a[mid] > n) {
				return binarySearch(n, a, i, mid-1);
		} else {
				return binarySearch(n, a, mid + 1, j);
		} 
		
		}
		}
}
