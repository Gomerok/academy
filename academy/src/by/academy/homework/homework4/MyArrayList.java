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

	private T[] arr;
	private int size = 16;
	private int pointer = -1;

	public MyArrayList() {
		super();
		this.arr = (T[]) new Object[size];
	}

	public MyArrayList(int init) {
		this.arr = (T[]) new Object[init];
		this.size = init;
	}

	public void add(T obj) {
			pointer++;
		if (pointer == size - 1) {
			size *= 2;
			T[] arrCopy = Arrays.copyOf(arr, size);
			arr = arrCopy;
		}
		arr[pointer] = obj;
	}

	public T get(int i) {
		return (T) arr[i];
	}

	public T getLast() {
		return (T) arr[pointer];
	}

	public T getFirst() {
		return (T) arr[0];
	}

	public int getSize() {
		return size;
	}

	public int getIndexLastObj() {
		return pointer;
	}

	public void remove(int i) {
		for (int k = i; k < pointer; k++) {
			arr[k] = arr[k + 1];
		}
		arr[pointer] = null;
		pointer--;
	}

	public void remove(T obj) {
		for (int i = 0; i < pointer; i++) {
			if (arr[i].equals(obj)) {
				for (int k = i; k < pointer; k++) {
					arr[k] = arr[k + 1];
				}
				arr[pointer] = null;
				pointer--;
				break;
			}
		}
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
