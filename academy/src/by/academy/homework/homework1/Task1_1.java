package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter age: ");
		int age = scan.nextInt();
		System.out.println("Enter sum: ");
		int sum = scan.nextInt();

		if (age > 0 && sum > 0) {

			if (sum < 100) {
				System.out.println("Total sum = " + (sum - sum * 0.05));
			}
			if (sum >= 100 && sum < 200) {
				System.out.println("Total sum = " + (sum - sum * 0.07));
			}
			if (sum >= 200 && sum < 300) {
				if (age >= 18) {
					System.out.println("Total sum = " + (sum - sum * 0.16));
				} else {
					System.out.println("Total sum = " + (sum - sum * 0.09));
				}
			}
			if (sum >= 300 && sum < 400) {
				System.out.println("Total sum = " + (sum - sum * 0.15));
			}
			if (sum >= 400) {
				System.out.println("Total sum = " + (sum - sum * 0.2));
			}
		} else {
			System.out.println("Entered incorrect sum or age");
		}
		scan.close();
	}

}