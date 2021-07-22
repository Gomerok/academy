package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		String line[] = scan.nextLine().split(" ");
		
		String line[] = {"Helloo","Word"};
		
		StringBuilder word = new StringBuilder();
		word.append(line[0].substring(0, line[0].length()/2)).append(line[1].substring(line[1].length()/2, line[1].length()));

		System.out.println(word);
		scan.close();
	}

}
