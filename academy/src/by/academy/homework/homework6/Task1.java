package by.academy.homework.homework6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	private static Scanner scan = new Scanner(System.in);
	private static final String STOP = "stop";

	public static void main(String[] args) {
//		Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, если введена
//		"stop" строка тогда закончить запись в файл.
		try {
			FileWriter write = new FileWriter(
					"C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\Task1Text.txt",
					false);
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
			write.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
