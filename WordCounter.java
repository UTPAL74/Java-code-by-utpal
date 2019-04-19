package com.ut.samp;

import java.util.Arrays;
import java.util.List;

public class WordCounter {

	public static void main(String[] args) {
		countWord("I am from tech mahindra and I am doing good with mahindra");

	}

	public static void countWord(String line) {
		List<String> list = Arrays.asList(line.split(" "));		
		
main:	for(int i = 0; i < list.size(); i++) {
			
			for(int k = 0; k < i; k++) {
				if(list.get(k).equals(list.get(i)))
					continue main;
			}
			
			int count = 0;
			
			for(int j = i; j < list.size(); j++) {				
				if (list.get(i).equals(list.get(j))) 
					count++;				
			}
			
			System.out.println(list.get(i)+" exist "+count+" times.");
		}
		
	}
	
}
