package com.practice;

public class MarsExploration {
	
	public static void main(String[] args) {
		System.out.println(messageDiff("SOSSTT"));
	}
	
	public static int messageDiff(String message) {
		
		int diff = 0;
		
		if (message.length() == 0) {
			return diff;
		} else {
		
		
			char[] sos = message.substring(0, 3).toCharArray();
			
			if (sos[0] != 'S') {
				diff++;
			}
			if (sos[1] != 'O') {
				diff++;
			}
			if (sos[2] != 'S') {
				diff++;
			}
			
			return diff + messageDiff(message.substring(3));
		
		}
		
	}

}
	

