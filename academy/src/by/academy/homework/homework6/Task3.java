package by.academy.homework.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Вася", "Пупкин1", 20));
		users.add(new User("Петя", "Пупкин2", 21));
		users.add(new User("Жора", "Пупкин3", 22));
		users.add(new User("Дима", "Пупкин4", 23));
		users.add(new User("Витя", "Пупкин5", 24));
		users.add(new User("Женя", "Пупкин6", 25));
		users.add(new User("Саша", "Пупкин7", 26));
		users.add(new User("Митя", "Пупкин8", 27));
		users.add(new User("Денис", "Пупкин9", 28));
		users.add(new User("Ян", "Пупкин10", 29));

		File usersDir = new File("src\\by\\academy\\homework\\homework6\\io\\usersDir");
		if (!usersDir.exists()) {
			usersDir.mkdirs();
		}

		for (User u : users) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
					usersDir.getAbsolutePath() + "\\" + u.getName() + "_" + u.getLastName() + ".txt"))) {
				oos.writeObject(u);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
