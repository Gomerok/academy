package by.academy.homework.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	private static Scanner scan = new Scanner(System.in);
	private static final String STOP = "stop";

	public static void main(String[] args) {

		File dir = new File("src\\by\\academy\\homework\\homework6\\io");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		try (FileWriter write = new FileWriter("src\\by\\academy\\homework\\homework6\\io\\Task1Text.txt", false)) {
			String[] input = scan.nextLine().split(" ");
			for (int i = 0; i < input.length; i++) {
				if (!input[i].equals(STOP)) {
					write.write(input[i]);
					write.append(" ");
				} else {
					write.write(input[i]);
					break;
				}
				if (i == input.length - 1) {
					write.append("\n");
					input = scan.nextLine().split(" ");
					i = -1;
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		scan.close();
	}

}
