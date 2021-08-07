package by.academy.homework.homework4;

import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		MyArrayList<String> arr = new MyArrayList<>();
		arr.add("Home");
		arr.add("Work");
		arr.add("3");
		arr.add("My");
		arr.add("Array");
		arr.add("List");
		arr.add("Demo");

		System.out.println(Arrays.toString(arr.getItems()));

		System.out.println("///////////");
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		arr.remove(3);
		arr.remove(24);
		arr.remove("List");
		arr.remove("Listtt");
		System.out.println(arr.getIndexLastObj());
		System.out.println(arr.getCopasity());
		System.out.println("///////////");
		System.out.println(Arrays.toString(arr.getItems()));
		arr.set(7, "sdsdsd");
		arr.set(2, "qqqqqq");
		System.out.println("///////////");
		System.out.println(Arrays.toString(arr.getItems()));
		arr.add("Home");
		arr.add("Work");
		arr.add("3");
		arr.add("My");
		arr.add("Array");
		arr.add("List");
		arr.add("Demo");
		arr.add("Home");
		arr.add("Work");
		arr.add("3");
		arr.add("My");
		arr.add("Array");
		arr.add("List");
		arr.add("Demo");
		arr.add("Home");
		arr.add("Work");
		arr.add("3");
		arr.add("My");
		arr.add("Array");
		arr.add("List");
		arr.add("Demo");
		System.out.println("///////////");
		System.out.println(Arrays.toString(arr.getItems()));
	}

}
