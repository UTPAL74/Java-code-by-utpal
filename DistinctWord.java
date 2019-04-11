package com.ut.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctWord {

	public static void main(String[] args) {
		// System.out.println(
		// giveDistinctWordFromLine("hello ut hello mom ut mom is hello and is fine and good"));
		//
//		String[] ar = distinctWordFromLine2nd("hello ut hello mom ut mom is hello and is fine and good");
//		for (String a : ar)
//			System.out.println(a);
		
//		distinctWordFromLine3rd("hello ut hello mom ut mom is hello and is fine and good");
		uniqueAndDistinct("hello ut hello mom ut mom is hello and is fine and good");
	}

	public static Collection<String> giveDistinctWordFromLine(String line) {
		String[] ar = line.split(" ");
		return Arrays.asList(ar).stream().collect(Collectors.toSet());
	}

	public static String[] distinctWordFromLine2nd(String line) {
		List<String> list = Arrays.asList(line.split(" "));
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			if (!result.contains(list.get(i)))
				result.add(list.get(i));
		}

		return result.toArray(new String[0]);

	}
	
	public static List<String> distinctWordFromLine3rd(String line){
		String[] ar = line.split(" ");
		List<String> s = new ArrayList<String>();
		
		
		for(int i = 0; i < ar.length; i++){
			if (s.contains(ar[i]))
				continue;
			
			int count = 0;
			
			for (int j = i; j < ar.length; j++){
				if (ar[i].equalsIgnoreCase(ar[j]))
					count++;			
			}
			
			if (count > 1)
				s.add(ar[i]);
			
			System.out.println(ar[i] +", "+count);
		}
				
		return s;
	}
	
	public static void uniqueAndDistinct(String line){
		
		Set<String> unique = new HashSet<String>();
		Set<String> dup = new HashSet<String>();
		
		String[] ar = line.split(" ");

		for(String s : ar){
			if (!unique.add(s))
				dup.add(s);
		}
		
		unique.removeAll(dup);
		
		System.out.println(unique +" : with "+unique.size()+" element.");
		System.out.println(dup +" : with "+dup.size()+" element.");
		
	}

}
