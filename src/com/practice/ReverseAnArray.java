package com.practice;

import java.util.Scanner;

public class ReverseAnArray {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 int arrCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[arrCount];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	        
	        reverseArray(arr);
	}
	
	static int[] reverseArray(int[] a) {

		int middle = a.length / 2;
		
		int len = a.length -1 ;
		
		for (int i = 0; i < middle; i++) {
			 int temp = a[i];
			 a[i] = a[len - i];
			 a[len-i] = temp;
			
		}
		
		return a;
    }

}
