package by.academy.homework.homework4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

	private T[] items;
	private int pointer = 0;

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		super();
		this.items = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public MyArrayList(int init) {
		super();
		this.items = (T[]) new Object[init];
	}

	public MyArrayList(T[] items) {
		super();
		this.items = items;
		this.pointer = items.length - 1;
	}

	public void add(T obj) {
		if (pointer == items.length - 1) {
			growth();
		}
		items[pointer++] = obj;
	}

	private void growth() {
		T[] arrCopy = Arrays.copyOf(items, items.length * 2 + 1);
		items = arrCopy;
	}

	public T get(int index) {
		if (index > pointer - 1 || index < 0) {
			System.out.println("Выход за пределы массива");
			return null;
		}
		return (T) items[index];
	}

	public T getLast() {
		if (items[pointer - 1].equals(null)) {
			System.out.println("Массив пуст");
			return null;
		}
		return (T) items[pointer - 1];
	}

	public T getFirst() {
		if (items[0].equals(null)) {
			System.out.println("Массив пуст");
			return null;
		}
		return (T) items[0];
	}

	public int getCopasity() {
		return items.length;
	}

	public int getIndexLastObj() {
		return pointer - 1;
	}

	public void remove(int index) {
		if (index > pointer - 1 || index < 0) {
			System.out.println("Выход за пределы массива");
			return;
		}
		if (index < pointer - 1) {
			System.arraycopy(items, index + 1, items, index, pointer - index - 1);
		}
		items[--pointer] = null;
	}

	public void remove(T obj) {
		for (int i = 0; i < pointer - 1; i++) {
			if (items[i].equals(obj)) {
				System.arraycopy(items, i + 1, items, i, pointer - i - 1);
				items[--pointer] = null;
			}
		}
		System.out.println("Такого объекта нет");
	}

	public void removeFirst(T obj) {
		for (int i = 0; i < pointer - 1; i++) {
			if (items[i].equals(obj)) {
				System.arraycopy(items, i + 1, items, i, pointer - i - 1);
				items[--pointer] = null;
				return;
			}
		}
		System.out.println("Такого объекта нет");
	}

	public void removeLast(T obj) {
		int lastPointer = 0;
		for (int i = 0; i < pointer - 1; i++) {
			if (items[i].equals(obj)) {
				lastPointer = i;
			}
		}
		if (lastPointer != 0) {
			System.arraycopy(items, lastPointer + 1, items, lastPointer, pointer - lastPointer - 1);
			items[--pointer] = null;
			return;
		}
		System.out.println("Такого объекта нет");
	}

	public void set(int index, T item) {
		if (index >= items.length || index < 0) {
			System.out.println("Выход за пределы массива");
			return;
		}
		if (index >= pointer) {
			items[pointer++] = item;
		} else {
			items[index] = item;
		}
	}

	public T[] getItems() {
		return items;
	}

	class MyLinkedListIterator implements Iterator<T> {
		private int current=0;

		@Override
		public boolean hasNext() {
			if (current == 0) { 
				return pointer !=0;
			}
			return items[current] !=null;
		}

		@Override
		public T next() {
			return items[current++];
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator();
	}
}
