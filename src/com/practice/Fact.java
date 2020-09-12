package com.practice;

public class Fact {
	
	public static void main(String[] args) {
		
		System.out.println(fact(4));
	}
	
	public static int fact(int num) {
		
		if (num == 1) {
			return num;
		} else {
			return num * fact(num - 1);
		}
	}

}
