package practice.concurrency.multithreading;

public class OddThread implements Runnable {
	Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public void run() {
		synchronized (Integer.class) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) {
					System.out.println("odd-num " + arr[i]);
				}
			}
		}
	}

}
