package by.academy.classwork.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	static Pattern pattern = Pattern.compile("Java\\s\\d+");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Version: Java 5, Java 6, Java7, Java 8, Java 12.";
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println(str.substring(matcher.start(), matcher.end()));
			
		}
	}

}
