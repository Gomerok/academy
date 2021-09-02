package by.academy.classwork.lesson16;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Tiger tiger = new Tiger();

		Class<Cat> catClass = Cat.class;
		Class<Tiger> tigerClass = Tiger.class;

		Method[] declaredMethodsCat = catClass.getDeclaredMethods();
		Method[] declaredMethodsTiger = tigerClass.getDeclaredMethods();
		System.err.println("Cat methods:  ");
		for (Method method : declaredMethodsCat) {
			System.out.println(method.getName());
		}
		System.err.println("Tiger methods:  ");
		for (Method method : declaredMethodsTiger) {
			System.out.println(method.getName());
		}
		System.err.println("Cat fields:  ");
		Field[] fieldsCat = catClass.getDeclaredFields();
		for (Field field : fieldsCat) {
			System.out.println(field.getName());
		}
		System.err.println("Cat fields:  ");
		Field[] fieldsTiger = tigerClass.getDeclaredFields();
		for (Field field : fieldsTiger) {
			System.out.println(field.getName());
		}
		System.err.println("Change tiger field");
		System.out.println(tiger.getSped());
		try {
			fieldsTiger[2].setAccessible(true);
			fieldsTiger[2].set(tiger, 30);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(tiger.getSped());
		System.err.println("Change cat field");
		System.out.println(tiger.getCountry());
		try {
			fieldsCat[1].setAccessible(true);
			fieldsCat[1].set(tiger, "Minsk");
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(tiger.getCountry());
	}

}
