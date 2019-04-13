package com.ut.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntoMap {

	public static void main(String[] args) {
		System.out.println(getAsMap("ut1pal2mgh3and7mithch8"));

	}

	public static Map<Integer, String> getAsMap(String arg) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		List<Integer> keys = new LinkedList<Integer>();
		List<String> values = new ArrayList<String>();

		for (int i = 0; i < arg.length(); i++) {

			String res = "";
			boolean flag = true;

			for (int j = i; flag; j++) {
				String s = arg.substring(j, j + 1);

				try {
					Integer.valueOf(s);
					flag = false;
					keys.add(Integer.valueOf(s));
					i = j;
				} catch (NumberFormatException ne) {
					res += s;
				}
			}

			values.add(res);
		}

		for (int i = 0, j = 0; i < keys.size() && j < values.size(); i++, j++) {
			map.put(keys.get(i), values.get(j));
		}
		return map;
	}

}
