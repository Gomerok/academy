package by.academy.homework.homework6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {

		File dir = new File("src\\by\\academy\\homework\\homework6\\io");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File textFile = new File("src\\by\\academy\\homework\\homework6\\io\\Task2Text.txt");
		if (!textFile.exists()) {
			System.err.println("Text file has not been created");
			return;
		}

		File resultFile = new File("src\\by\\academy\\homework\\homework6\\io\\Task2TextResult.txt");
		try {
			if (!resultFile.exists()) {
				resultFile.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try (FileReader readFile = new FileReader(textFile)) {
			FileWriter writeFile = new FileWriter(resultFile, false);

			int c;
			while ((c = readFile.read()) != -1) {
				if ((char) c != ' ') {
					writeFile.write(c);
				}
			}
			writeFile.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
