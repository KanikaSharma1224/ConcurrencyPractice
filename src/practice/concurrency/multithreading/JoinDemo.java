package practice.concurrency.multithreading;

public class JoinDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child1 Thread name : " + "Thread [" + i + "]" + Thread.currentThread().getName());
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child2 Thread name : " + "Thread [" + i + "]" + Thread.currentThread().getName());
			}
		});
		System.out.println("Main Thread executing: " + Thread.currentThread().getName());
		t1.start();
		try {
			t1.join(1000);
		} catch (InterruptedException ie) {
			return;
		}
		t2.start();
		try {

			t2.join();
		} catch (InterruptedException ie) {
			return;
		}
		System.out.println("Thread Exceuting : " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("In Main : " + Thread.currentThread().getName());
		}

	}

}
