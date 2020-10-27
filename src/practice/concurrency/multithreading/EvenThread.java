package practice.concurrency.multithreading;

public class EvenThread implements Runnable {
	Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void run() {
		synchronized (Integer.class) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println("even-num " + arr[i]);
				}
			}
		}
	}

}
