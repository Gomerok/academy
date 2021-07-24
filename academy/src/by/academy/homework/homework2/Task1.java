package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите 2 слова через пробел:");
		String words[] = scan.nextLine().split(" ");
		while (words.length != 2) {
			System.out.println("Неправильный ввод, введите заново:");
			words = scan.nextLine().split(" ");
		}

		if (words[0].length() != words[1].length()) {
			System.out.println("Строки разной длины");
		} else {

			int[] letters = new int[256];

			char[] simbolArr = words[0].toCharArray();
			for (char c : simbolArr) {
				letters[c]++;
			}

			int flag = 0;
			for (int i = 0; i < words[1].length(); i++) {
				int c = (int) words[1].charAt(i);
				if (--letters[c] < 0) {
					flag++;
					System.out.println("Строки из разных символов");
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Строки из одинаковых символов");
			}
		}
		scan.close();
	}

}