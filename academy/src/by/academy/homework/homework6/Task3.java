package by.academy.homework.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {
//	Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
//	В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог(папку) 
//	users и для каждого пользователя создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt. 
//	Сериализуйте информацию о пользователе и положите в файл пользователя. Не забываем закрывать потоки. 
//	В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		User us1 = new User("Вася", "Пупкин1", 20);
		User us2 = new User("Петя", "Пупкин2", 21);
		User us3 = new User("Жора", "Пупкин3", 22);
		User us4 = new User("Дима", "Пупкин4", 23);
		User us5 = new User("Витя", "Пупкин5", 24);
		users.add(us1);
		users.add(us2);
		users.add(us3);
		users.add(us4);
		users.add(us5);

		File usersDir = new File(
				"C:\\Users\\User\\git\\academy\\academy\\src\\by\\academy\\homework\\homework6\\usersDir");
		if (usersDir.mkdir()) {
			System.out.println("Folder has been created");
		}
		for (int i = 0; i < users.size(); i++) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(usersDir.getAbsolutePath() + "\\"
					+ users.get(i).getName() + "_" + users.get(i).getLastName() + ".txt"))) {
				oos.writeObject(users.get(0));
			} catch (IOException e) {

				System.err.println(e.getMessage());
			}
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(usersDir.getAbsolutePath() + "\\"
				+ users.get(0).getName() + "_" + users.get(0).getLastName() + ".txt"))) {
			try {
				User newUser = (User) ois.readObject();
				System.out.println(newUser.getAge());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
