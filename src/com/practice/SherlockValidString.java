package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SherlockValidString {
	
	public static void main(String[] args) {
		System.out.println(isValid("abcdefghhgfedecba"));
	}
	
	static String isValid(String s) {
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		Map<Integer, Integer> numCountMap = new TreeMap<Integer, Integer>();
		
		char[] chars = s.toCharArray();
		
		for (char c : chars) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		
		for(Integer n: charCountMap.values()) {
			
			if (numCountMap.containsKey(n)) {
				numCountMap.put(n, numCountMap.get(n) + 1);
			} else {
				numCountMap.put(n, 1);
			}
					
		}
		
		if (numCountMap.size() == 1) {
			return "YES";
		}
		
		if (numCountMap.size() > 2) {
			return "NO";
		} else {
			
			Iterator<Entry<Integer, Integer>> numItr = numCountMap.entrySet().iterator();
			
			Entry<Integer, Integer> lowCountEntry = numItr.next();
			Entry<Integer, Integer> highCountEntry = numItr.next();
			Integer lowCount = lowCountEntry.getKey();
			Integer lowCountValue = lowCountEntry.getValue();
			Integer highCount = highCountEntry.getKey();
			Integer highCountValue =highCountEntry.getValue();
			
			if (lowCountValue >= 2) {
				return "NO";
			}
			
			
			
			if (highCount - 1 == lowCount) {
				return "YES";
			}
			
			if (lowCountValue - 1 == 0) {
				return "YES";
			} else {
				return "NO";
			}
			
			
			/*
			 * if ( highCount - lowCount == 1) { return "YES"; } else { return "NO"; }
			 */
			
		}
		

    }

}
