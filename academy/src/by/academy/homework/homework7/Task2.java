package by.academy.homework.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task2 {

	public static void main(String[] args) {
//	а затем через 
//	getDeclaredMethod("name")
//	getDeclaredMethods()
//	getDeclaredField("name")
//	getDeclaredFields()
//	Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
//	Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

		// User user = new User();
		Class<User> userClass = User.class;

		try {
			System.err.println("getField(\"name\")");
			Field loginField = userClass.getField("login");
//			Field passwordField = userClass.getField("password");
//			Field emailField = userClass.getField("email");
			System.out.println(loginField.getName());
//			System.out.println(passwordField.getName());
//			System.out.println(emailField.getName());

			System.err.println("getFields()");
			Field[] userFields = userClass.getFields();
			for (Field field : userFields) {
				System.out.println(field.getName());
			}

			System.err.println("getMethod(\"name\")");
			Method getEmailMethod = userClass.getMethod("getEmail");
			System.out.println(getEmailMethod.getName());

			System.err.println("getMethods()");
			Method[] methods = userClass.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			
			System.err.println("getDeclaredMethod(\"name\")");
			Method getEmaildeclaredMethods = userClass.getDeclaredMethod("getEmail");
			Method printUserInfoDeclaredMethods = userClass.getDeclaredMethod("printUserInfo");
			//printUserInfoDeclaredMethods.setAccessible(true);
			System.out.println(getEmaildeclaredMethods.getName());
			System.out.println(printUserInfoDeclaredMethods.getName());
		} catch (NoSuchFieldException | SecurityException | NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
