package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	public static void main(String[] args) {
//		Можно писать все в main. Не нужно создавать новых классов.
//		Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 6));
		System.out.println(collection.toString());
		collection = removeDuplicates(collection);
		System.out.println(collection.toString());
	}

}
