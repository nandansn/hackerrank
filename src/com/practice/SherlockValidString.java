package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SherlockValidString {
	
	public static void main(String[] args) {
		System.out.println(isValid("xxxaabbccrry"));
	}
	
	static String isValid(String s) {
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		Map<Integer, TreeSet<Character>> numCountMap = new HashMap<Integer, TreeSet<Character>>();
		
		char[] chars = s.toCharArray();
		
		for (char c : chars) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		
		for(Entry<Character, Integer> n: charCountMap.entrySet()) {
			
			if (numCountMap.size() > 2) {
				return "NO";
				
			}
			
			if (numCountMap.containsKey(n.getValue())) {
				TreeSet<Character> set = numCountMap.get(n.getValue());
				set.add(n.getKey());
				numCountMap.put(n.getValue(), set);
			} else {
				TreeSet<Character> set = new TreeSet<Character>();
				set.add(n.getKey());
				numCountMap.put(n.getValue(), set);
			}
					
		}
		
		if(numCountMap.size() == 1) {
			return "YES";
		}
		
		int diff = 0;
		
		
		Iterator<Entry<Integer, TreeSet<Character>>> iterator = numCountMap.entrySet().iterator();
		
		Entry<Integer, TreeSet<Character>> firstSet = iterator.next();
		Entry<Integer, TreeSet<Character>> secondSet = iterator.next();
		
		int firstSetSize =  firstSet.getValue().size();
		int secondSetSize =  secondSet.getValue().size();
		
		diff =  firstSet.getKey() - secondSet.getKey();
		
		if (diff == 0) {
			if ((firstSetSize == 1 && firstSet.getKey() > 1) || (secondSetSize == 1 && secondSet.getKey() > 1)) {
				return "NO";
			} else {
				return "YES";
			}
		
		} else {
			if ((diff == 1 || diff == -1) ) {
				if (firstSetSize >= 2 && secondSetSize >= 2 ) {
					return "NO";
				} else {
					return "YES";
				}
			} else {
				return "NO";
			}
		}
		

    }

}
