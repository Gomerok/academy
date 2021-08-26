package by.academy.homework.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {

		Map<Character, Integer> freqDictionary = new HashMap<>();
		String input = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		Integer freq = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			freq = freqDictionary.get(c);
			if (freq != null) {
				freqDictionary.put(c, freq + 1);
			} else {
				freqDictionary.put(c, 1);
			}

		}
		System.out.println(freqDictionary);
	}

}
