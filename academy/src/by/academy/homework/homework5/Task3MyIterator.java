package by.academy.homework.homework5;

import java.util.Iterator;

public class Task3MyIterator<T> implements Iterator<T> {
//	Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//	Протестировать в main.
	T[][] arr;
	int currenti = 0;
	int currentj = 0;

	public Task3MyIterator(T[][] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		if (currenti == 0) {
			return arr.length != 0 && arr[currenti] != null;
		}
		return currenti != arr.length && arr[currenti] != null;
	}

	@Override
	public T next() {
		if(currentj==arr.length) {
			
		}
		return arr[currentj][currenti++];
	}

}
