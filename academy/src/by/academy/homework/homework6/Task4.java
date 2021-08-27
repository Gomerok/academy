package by.academy.homework.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
//		Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
//		Считываем текст из 2-ого задания, получаем его длинну (576 символов).
//		Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания)
//		такое-же количество символов (string.substring()) и сохраняем в наш файл. 
//		Создайте файл result.txt и запишите туда список всех файлов и их размеры.

		File file;
		Random rand = new Random();
		String textTask2;
		
		File dir = new File("C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\io\\Dir");
		if (dir.mkdir()) {
			System.out.println("Folder has been created");
		}

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
		file = new File("C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\io\\Task2Text.txt");
		if (!file.exists()) {
			return;
		}
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			textTask2 = bufferedReader.readLine();
			for (int i = 1; i <= 100; i++) {
				file = new File("C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\io\\Dir\\" + i + ".txt");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(textTask2.substring(0, rand.nextInt(textTask2.length())));
				fileWriter.close();
			}
			file = new File("C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\io\\Task4TextResult.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file);
			File[] files = dir.listFiles();
			for (int i=0;i<files.length;i++) {
				fileWriter.write(files[i].getName() + " " + files[i].length() + "\r\n");
			}
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
