package practice.concurrency.multithreading;

public class SleepDemo {
	private static String[] arr = new String[] { "Hello Kanika", "Hello Ashu", "Hello Norway", "Hello Winter" };

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Sleep for 4 seconds");
			System.out.println(arr[i]);
			Thread.sleep(4000);
		}
	}

}
