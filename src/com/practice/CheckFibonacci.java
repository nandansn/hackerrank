package com.practice;

public class CheckFibonacci {
	public static void main(String[] args) {
		
		System.out.println(isFibonacci(999999990, 0, 1));
		
	}
	
	public static boolean isFibonacci(int n, int i , int nx) {
		
		if (n - nx == 0) {
			return true;
		} else if (nx > n) {
			return false;
		} else {
			int t = nx;
			nx = nx + i;
			i = t;
			return isFibonacci(n, i, nx);
		}
		
	}

}
