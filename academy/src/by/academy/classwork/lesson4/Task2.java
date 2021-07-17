package by.academy.classwork.lesson4;

import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str, maxLine = "", minLine;

//		StringBuilder maxLine = new StringBuilder("");
//		StringBuilder minLine = new StringBuilder("");

		int n = 5, i = 0;
		str = scan.nextLine();
		minLine = str;
		do {

			if (str.length() > maxLine.length()) {
				maxLine = str;
			}
			if (str.length() < minLine.length()) {
				minLine = str;
			}
			str = scan.nextLine();
			i++;
		} while (i < n);

		System.out.println(maxLine + ":" + maxLine.length());
		System.out.println(minLine + ":" + minLine.length());

		scan.close();
	}

}
