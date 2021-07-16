package by.academy.dopTasks.Strings;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = 5;
		String temp;
		String line[] = new String[n];

		for (int i = 0; i < n; i++) {
			line[i] = scan.nextLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (line[i].length()<line[j].length()) { //чтобы отсортировать по убыванию нужно поменять знак
					temp=line[i];
					line[i]=line[j];
					line[j]=temp;
				}

			}
		}

		for(int i=0;i<n;i++) {
			System.out.println(line[i]);
		}
		scan.close();
	}

}
