package by.academy.classwork.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	static Pattern pattern = Pattern.compile("c{0,3}ab");
	public static void main(String[] args) {
		
		String str ="dfsfgg, sdsd, cab , dfsdf, cccab";
		Matcher matcher = pattern.matcher(str);
		
		boolean b = matcher.matches();
		
		while(matcher.find()) {
			System.out.println(str.substring(matcher.start(), matcher.end()));
		}
		
		System.out.println(b);

	}

}
