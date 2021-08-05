package by.academy.classwork.lesson8;

public class CustomArrayList<T> {

	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public CustomArrayList() {
		super();
		items = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public CustomArrayList(int initCap) {
		super();
		items = (T[]) new Object[initCap];
	}

	public CustomArrayList(T[] items) {
		super();
		this.items = items;
		this.size = items.length;
	}

	@SuppressWarnings("unchecked")
	private void growth() {
		// T[] arrCopy = Arrays.copyOf(items, items.length*2 + 1);
		// items = arrCopy;
		T[] newArr = (T[]) new Object[items.length * 2 + 1];
		System.arraycopy(items, 0, newArr, 0, items.length);
		items = newArr;
	}

	public void add(T item) {
		if (size >= items.length) {
			growth();
		}
		items[size++] = item;
	}

	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("Error");
			return;
		}
		if (index < size - 1) {
			System.arraycopy(items, index + 1, items, index, size - index - 1);
		}
		items[--size] = null;
	}

	public void set(int index, T item) {
		if (index >= items.length || index < 0) {
			System.out.println("Error");
			return;
		}
		if (index >= size) {
			items[size++] = item;
		} else {
			items[index] = item;
		}
	}

	public T get(int index) {
		if (index >= size || index < 0) {
			System.out.println("Выход за пределы массива");
			return (T) items[index];
		} else {
			return (T) items[index];
		}

	}

	public T[] getItems() {
		return items;
	}
}
