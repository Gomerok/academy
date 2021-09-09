package by.academy.classwork.lesson17;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		// ------------------------------------------
		MyThread2 myThread21 = new MyThread2();
		Thread thread21 = new Thread(myThread21);

		MyThread2 myThread22 = new MyThread2();
		Thread thread22 = new Thread(myThread22);

		MyThread2 myThread23 = new MyThread2();
		Thread thread23 = new Thread(myThread23);
		thread21.start();
		thread22.start();
		thread23.start();

		// ------------------------------------------

		Integer[] array = {1,1,2,3,4,5,63,2};
		
		ThreadRun1 threadRun1 = new ThreadRun1(array);
		Thread thread1 = new Thread(threadRun1);

		ThreadRun2 threadRun2 = new ThreadRun2(array);
		Thread thread2 = new Thread(threadRun2);

		ThreadRun3 threadRun3 = new ThreadRun3(array);
		Thread thread3 = new Thread(threadRun3);

		System.out.println("Начали выполнение в главном потоке");
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();

		System.out.println("Закончили выполнение в главном потоке");

	}

}
