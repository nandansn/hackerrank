package com.practice;

import java.util.Scanner;

public class Palindrome {
	
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        
	        
	        for (int i = 0; i < A.length(); i++) {
	        	
	        	if (A.charAt(i) == A.charAt((A.length() - 1 -i)) {
	        		continue;
	        	} else {
	        		System.out.println("NO");
	        		System.exit(0);
	        	}
				
			}
	        
	        System.out.println("YES");
	        
	    }

}
