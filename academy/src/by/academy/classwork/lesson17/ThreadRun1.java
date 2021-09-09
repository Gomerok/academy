package by.academy.classwork.lesson17;

import java.util.Arrays;

public class ThreadRun1 implements Runnable {

	private Integer[] array;

	public ThreadRun1(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		Arrays.stream(array).min(Integer::compareTo);
	}

}
