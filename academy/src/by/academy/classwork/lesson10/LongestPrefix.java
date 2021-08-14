package by.academy.classwork.lesson10;

import java.util.HashMap;
import java.util.Map;

public class LongestPrefix {

	public static void main(String[] args) {
		String[] array = { "test", "test1", "test5" };
		System.out.println(getLongPref(array));
	}

	public static String getLongPref(String[] array) {
		String longestPref = null;
		Map<String, Integer> prefCounter = new HashMap<>();

		String langestString = null;

		for (int i = 0; i < array.length; i++) {
			String current = array[i];
			if (langestString == null || langestString.length() < current.length()) {
				langestString = current;
				continue;
			}
		}
		for (int i = 0; i < array.length; i++) {
			String tepm = array[i];
			for (int j = 0; j < array.length; j++) {
				String s = tepm.substring(0, j);
				if (prefCounter.containsKey(s)) {
					prefCounter.put(s, prefCounter.get(s) + 1);
				} else {
					prefCounter.put(tepm.substring(0, j), 1);
				}
			}
		}
		System.out.println(prefCounter);
		for (String s : prefCounter.keySet()) {
			if (prefCounter.get(s) < 2) {
				continue;
			}
			if (longestPref == null) {
				longestPref = s;
			}
		}
		return longestPref;
	}

}
