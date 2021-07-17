package by.academy.classwork.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	static Pattern pattern = Pattern.compile("cab|ccab|cccab");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str ="dfsfgg, sdsd, cab, dfsdf, ccab";
		Matcher matcher = pattern.matcher("cab");
		//Matcher matcher2= pattern.matcher(str);
		boolean b = matcher.matches();
		
//		while(matcher2.find()) {
//			
//		}
		
		System.out.println(b);

	}

}
