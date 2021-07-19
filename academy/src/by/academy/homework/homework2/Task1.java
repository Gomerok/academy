package by.academy.homework.homework2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите 2 строки через пробел \"????...\" \"????...\":");
		String[] line = scan.nextLine().split(" ");
		Pattern pattern = Pattern.compile("[" + line[0] + "]");
		Matcher match = pattern.matcher(line[1]);

		int i = 0;

		while (match.find()) {
			i++;
		}

		if (i == line[0].length()) {
			System.out.println("Строки из одинаковых символов");
		} else {
			System.out.println("Строки из разных символов");
		}
		scan.close();
	}

}
