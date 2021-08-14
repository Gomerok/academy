package by.academy.homework.homework5;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
	private static Random rand = new Random();

	public static <T> void addItems(List<Integer> list) {

		for (int i = 0; i < 1000000; i++) {
			list.add(rand.nextInt(1000));
		}
	}

	public static <T> void selectionRandomItems(List<Integer> list) {

		for (int i = 0; i < 100000; i++) {
			list.get(rand.nextInt(99999));
		}
	}

	public static void main(String[] args) {
//		Можно писать все в main. Не нужно создавать новых классов.
//		Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//		Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//		Замерьте время, которое потрачено на это. 
//		Сравните результаты и предположите, почему они именно такие.

		ArrayList<Integer> aList = new ArrayList<>();
		LinkedList<Integer> lList = new LinkedList<>();
		long time = System.currentTimeMillis();
		addItems(aList);
		System.out.println("Время добавления в ArrayList: " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		addItems(lList);
		System.out.println("Время добавления в LinkedList: " + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		selectionRandomItems(aList);
		System.out.println(
				"Время получения 100000 рандомных элементов в ArrayList: " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		selectionRandomItems(lList);
		System.out.println(
				"Время получения 100000 рандомных элементов в LinkedList: " + (System.currentTimeMillis() - time));

	}

}
