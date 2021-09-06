package by.academy.homework.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {

	public static void main(String[] args) {

//	Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
//	Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

		User user = new User();
		Class<User> userClass = User.class;

		try {
			System.out.println("getField(\"name\")");
			Field loginField = userClass.getField("login");
//			Field passwordField = userClass.getField("password");
//			Field emailField = userClass.getField("email");
			System.out.println(loginField.getName());
//			System.out.println(passwordField.getName());
//			System.out.println(emailField.getName());

			System.out.println("getFields()");
			Field[] userFields = userClass.getFields();
			for (Field field : userFields) {
				System.out.println(field.getName());
			}

			System.out.println("getMethod(\"name\")");
			Method getEmailMethod = userClass.getMethod("getEmail");
			System.out.println(getEmailMethod.getName());

			System.out.println("getMethods()");
			Method[] methods = userClass.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}

			System.out.println("getDeclaredField(\"name\")");
			Field loginDeclaredField = userClass.getDeclaredField("login");
			Field passwordDeclaredField = userClass.getDeclaredField("password");
			Field emailDeclaredField = userClass.getDeclaredField("email");
			System.out.println(loginDeclaredField.getName());
			System.out.println(passwordDeclaredField.getName());
			System.out.println(emailDeclaredField.getName());

			System.out.println("getDeclaredFields()");
			Field[] userDeclaredFields = userClass.getDeclaredFields();
			for (Field field : userDeclaredFields) {
				System.out.println(field.getName());
			}

			System.out.println("getDeclaredMethod(\"name\")");
			Method getEmaildeclaredMethod = userClass.getDeclaredMethod("getEmail");
			Method printUserInfoDeclaredMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println(getEmaildeclaredMethod.getName());
			System.out.println(printUserInfoDeclaredMethod.getName());

			System.out.println("getDeclaredMethods()");
			Method[] getUserMethods = userClass.getDeclaredMethods();
			for (Method method : getUserMethods) {
				System.out.println(method.getName());
			}

			System.out.println("setUserFields()");
			loginDeclaredField.setAccessible(true);
			passwordDeclaredField.setAccessible(true);
			emailDeclaredField.setAccessible(true);
			System.out.println("Before change: " + user.getLogin() + "," + user.getPassword() + "," + user.getEmail());
			loginDeclaredField.set(user, "admin");
			passwordDeclaredField.set(user, "password");
			emailDeclaredField.set(user, "email");
			System.out.println("After change: " + user.getLogin() + "," + user.getPassword() + "," + user.getEmail());

			System.out.println("Fields volues:");
			for (Field field : userDeclaredFields) {
				field.setAccessible(true);
				System.out.println(field.getName() + ": " + field.get(user));
			}

			Method toStringDeclaredMethod = userClass.getDeclaredMethod("toString");
			System.out.println(toStringDeclaredMethod.invoke(user));

		} catch (NoSuchFieldException | SecurityException | NoSuchMethodException | IllegalArgumentException
				| IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
