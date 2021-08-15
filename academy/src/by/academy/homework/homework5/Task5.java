package by.academy.homework.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
//		Можно писать все в main. Не нужно создавать новых классов.
//		Имеется текст. Следует составить для него частотный словарь:
//		Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.
		Map<Character, Integer> freqDictionary = new HashMap<>();
		String input = "yasdyd asdddas ew reer";
		Integer freq = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			freq = freqDictionary.get(c);
			if (freq != null) {
				freqDictionary.put(c,freq+1);
			} else {
				freqDictionary.put(c, 1);
			}
			 
			 //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
			
			
			//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
			
			//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 

			
			
			
			
			
		}
		System.out.println(freqDictionary.toString());
	}

}
