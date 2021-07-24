package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("������� 2 ����� ����� ������ � ������ ����������� ��������:");
		String words[] = scan.nextLine().split(" ");

		while (words.length != 2 || words[0].length() % 2 != 0 || words[1].length() % 2 != 0) {
			System.out.println("������������ ����, ������� ������:");
			words = scan.nextLine().split(" ");
		}

		StringBuilder word = new StringBuilder();
		word.append(words[0].substring(0, words[0].length() / 2))
				.append(words[1].substring(words[1].length() / 2, words[1].length()));

		System.out.println("������������ �����: " + word);
		scan.close();
	}

}
