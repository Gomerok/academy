package by.academy.homework.homework6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		// Создать новый файл result.txt. Программно считать файл с текстом, удалить все
		// пробелы и записать полученный текст в result.txt.

		try {
			FileReader read = new FileReader(
					"C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\Task2Text.txt");
			FileWriter write = new FileWriter(
					"C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\Task2TextResult.txt",
					false);
			int c;
			while ((c = read.read()) != -1) {
				if ((char) c != ' ') {
					write.write(c);
				}
			}
			read.close();
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
