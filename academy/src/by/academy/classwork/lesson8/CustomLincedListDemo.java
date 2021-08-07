package by.academy.classwork.lesson8;

import java.util.Iterator;

public class CustomLincedListDemo {

	public static void main(String[] args) {
		CustomLincedList<Integer> list = new CustomLincedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.print();

		list.remove(2);
		list.remove(0);
		list.print();
		list.remove(0);

		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
