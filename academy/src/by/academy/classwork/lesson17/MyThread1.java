package by.academy.classwork.lesson17;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(i);
		}

	}

}
