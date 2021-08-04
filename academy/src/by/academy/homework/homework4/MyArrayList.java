package by.academy.homework.homework4;

import java.util.Arrays;

public class MyArrayList<T> {

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

	private Object[] arr;
	private int size = 16;
	private int pointer = 0;

	public MyArrayList() {
		super();
		this.arr = new Object[size];
	}

	public MyArrayList(int initialCapacity) {
		this.arr = new Object[initialCapacity];
		this.size = initialCapacity;
	}

	public void add(T obj) {
		if (pointer == this.size-1) {
			this.size *= 2;
			Object[] arrCopy = Arrays.copyOf(this.arr, this.size);
			arr = arrCopy;
		}
		arr[pointer++] = obj;
	}

	public Object get(int i) {
		return this.arr[i];
	}

	public Object getLast() {
		return arr[pointer-1];
	}

	public Object getFirst() {
		return this.arr[0];
	}

	public int getSize() {
		return this.size;
	}

	public int getIndexLastObj() {
		int index = pointer - 1;
		return index;
	}

	public void remove(int i) {
		for (int k = i; k < pointer; k++) {
			this.arr[k] = this.arr[k + 1];
		}
		this.arr[pointer] = null;
		pointer--;
	}

	public void remove(T obj) {
		for (int i = 0; i < this.pointer; i++) {
			if (this.arr[i].equals(obj)) {
				for (int k = i; k < pointer; k++) {
					this.arr[k] = this.arr[k + 1];
				}
				this.arr[pointer] = null;
				pointer--;
				break;
			}
		}
	}
}
