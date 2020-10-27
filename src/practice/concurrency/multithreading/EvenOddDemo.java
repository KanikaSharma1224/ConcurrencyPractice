package practice.concurrency.multithreading;

public class EvenOddDemo {
	public static void main(String[] args) {
		new Thread(new EvenThread()).start();
		new Thread(new OddThread()).start();
	}

}
