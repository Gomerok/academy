package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите слова через пробел(как минимум 2 слова):");
		String words[] = scan.nextLine().split(" ");
		while (words.length < 2) {
			System.out.println("Неправильный ввод, введите заново:");
			words = scan.nextLine().split(" ");
		}
		StringBuilder symbols = new StringBuilder();
		int arr[] = new int[words.length];
		String s;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				s = String.valueOf(words[i].charAt(j));
				if (symbols.indexOf(s) == -1) {
					symbols.append(s);
				}
			}
			arr[i] = symbols.length();
			symbols.setLength(0);
		}

		int minLength = arr[0], minLengthIndex = 0;
		for (int i = 0; i < words.length; i++) {
			if (arr[i] < minLength) {
				minLength = arr[i];
				minLengthIndex = i;
			}
		}
		System.out.println("Слово с минимальным числом различных символов: " + words[minLengthIndex]);

		scan.close();

	}

}
