package by.academy.homework.homework2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("������� 2 ����� ����� ������:");
		String words[] = scan.nextLine().split(" ");

//		while (words.length < 2) {
//			System.out.println("������������ ����, ������� ������:");
//			words = scan.nextLine().split(" ");
//		}
//		
//		Pattern pattern = Pattern.compile("[" + words[0] + "]");
//		Matcher match = pattern.matcher(words[1]);
//
//		int counter = 0;
//
//		while (match.find()) {
//			counter++;
//		}
//
//		if (counter == words[0].length()) {
//			System.out.println("������ �� ���������� ��������");
//		} else {
//			System.out.println("������ �� ������ ��������");
//		}
		
		
		scan.close();
	}

}