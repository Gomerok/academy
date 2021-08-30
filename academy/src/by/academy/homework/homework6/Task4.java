package by.academy.homework.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	private static Random rand = new Random();

	public static void main(String[] args) {
		String textTask2;

		File dir = new File("src\\by\\academy\\homework\\homework6\\io\\dirTask4");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file;
		for (int i = 1; i <= 100; i++) {
			file = new File(dir.getAbsolutePath() + "\\" + i + ".txt");
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		file = new File("src\\by\\academy\\homework\\homework6\\io\\Task2Text.txt");
		if (!file.exists()) {
			System.err.println("Text file has not been created");
			return;
		}
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			textTask2 = bufferedReader.readLine();
			for (int i = 1; i <= 100; i++) {
				file = new File("src\\by\\academy\\homework\\homework6\\io\\dirTask4\\" + i + ".txt");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(textTask2.substring(0, rand.nextInt(textTask2.length())));
				fileWriter.close();
			}
			file = new File("src\\by\\academy\\homework\\homework6\\io\\Task4TextResult.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file);
			File[] files = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				fileWriter.write(files[i].getName() + " " + files[i].length() + "\r\n");
			}
			fileWriter.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
