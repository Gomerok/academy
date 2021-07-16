package by.academy.dopTasks.Strings;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int sum = 0, n = 5;
		String line[] = new String[n];

		for (int i = 0; i < n; i++) {
			line[i] = scan.nextLine();
			sum += line[i].length();
		}

		sum /= n;

		System.out.println(sum);
		for (int i = 0; i < n; i++) {

			if (line[i].length() < sum) {
				System.out.println(line[i] + " length: " + line[i].length());
			}

		}

		scan.close();
	}

}
