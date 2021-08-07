package by.academy.classwork.lesson8;

import java.util.Iterator;

public class CustomLincedList<T> implements Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;

	public void add(T item) {
		Node<T> node = new Node();
		node.value = item;
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail; //// ???
			tail = node;
		}
		size++;
	}

	public T getHeadValue() {
		if (head != null) {
			return head.value;
		}
		return null;
	}

	public T getTailValue() {
		if (tail != null) {
			return tail.value;
		}
		return null;
	}

	public void remove(int index) {
		if (size == 1 && index == 0) {
			head = null;
			tail = null;
			size = 0;
			return;
		}
		if (index == size - 1) {
			Node<T> prev = tail.prev;
			prev.next = null;
			tail = prev;
			size--;
			return;
		}
		if (index >= 0 && index < size) {
			Node<T> node = head;
			int counter = 0;
			while (node != null) {
				if (counter == index) {
					break;
				}
				node = node.next;
				counter++;
			}
			Node<T> prev = node.prev;
			Node<T> next = node.next;
			if (index == 0) {
				head = next;
			}
			if (prev != null) {
				prev.next = next;
			}
			next.prev = prev;
			size--;
			return;
		}
		System.out.println("Index of bound");
	}

	public void set(T item) {

	}

	// Доделать
//	private Node<T> getNode(int index) {
//		Node<T> node = head;
//		int counter = 0;
//		while (node != null) {
//			if (counter == index) {
//				break;
//			}
//			node = node.next;
//			counter++;
//		}
//		return null;
//	}

	public void print() {
		Node<T> node = head;
		while (node != null) {
			System.out.print(node.value + " ");
			node = node.next;
		}
		System.out.println();
	}

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}
	
	

	class InnerIterator implements Iterator<T> {
		Node<T> current = null;

		@Override
		public boolean hasNext() {
			if (current == null) {
				return head != null;

			}
			return current.next != null;
		}

		@Override
		public T next() {
			if(current == null){
				current = head;
			}
			T value = current.value;
			current = current.next;
			return value;
		}

	}



	@Override
	public Iterator<T> iterator() {
		return new InnerIterator();
	}

	

}
