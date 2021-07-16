package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 10: ");
		int value = scan.nextInt();

		for (;;) {
			if (value <= 10 && value >= 1) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(value + "*" + i + "=" + value*i);
					scan.close();
				}
			} else {
				System.out.println("Invalid number. Enter a number from 1 to 10: ");
				value = scan.nextInt();
				continue;
			}
			break;
		}
	}

}
