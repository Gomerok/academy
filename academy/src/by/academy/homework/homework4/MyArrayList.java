package by.academy.homework.homework4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterator<T> {

//	Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
//	Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//	Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//
//	Содержит методы:
//	1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
//	2) взятие по индексу get(int i)
//	3) взятие последнего элемента getLast()
//	4) взятие первого элемента getFirst()
//	5) вывод размера массива
//	6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//	7) удаление элемента по индексу (remove(int i)
//	8) удаление элемента по значению (remove(T obj))

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
				if (i < pointer - 1) {
					System.arraycopy(items, i + 1, items, i, pointer - i - 1);
				}
				items[--pointer] = null;
				return;
			}
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

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
}
