package by.academy.dopTasks.Strings;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = 5;
		// StringBuilder str = new StringBuilder();
		int arr[] = new int[n];
		// String line[] = scan.nextLine().split(" ");

		String line[] = { "ssdde", "scrc", "buiilldd", "tr", "ff" };
		String s;

		for (int i = 0; i < n; i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < line[i].length(); j++) {
				s = String.valueOf(line[i].charAt(j));

//				if (line[i].indexOf(s) != -1 && line[i].indexOf(s) != j && str.indexOf(s) == -1) {
//					str.append(s);
//				}
				
				if (str.indexOf(s) == -1) {
					str.append(s);
				}
				
			}

			arr[i] = str.length();
			// str.setLength(0);
		}

		int min = arr[0], minIndex = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println(line[minIndex]);

		scan.close();

	}

}
