
package by.academy.lesson3;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		int b;

		for (int i = 0; i <= n; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (a > b) {
				System.out.println("a");
			} else {
				System.out.println("b");
			}

		}

	}

}
