package practice.concurrency.multithreading;

public class LongWrapperRaceCondition {
	public static void main(String[] args) throws InterruptedException {
		LongWrapper wrap = new LongWrapper(0L);
		Runnable r = () -> {
			for (int i = 0; i < 1_000; i++) {
				wrap.incrementValue();
			}
		};
		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1_000; i++) {
			threads[i] = new Thread(r);
			threads[i].start();
		}
		for (int i = 0; i < 1000; i++) {
			threads[i].join();
		}

		System.out.println("Wrapper Value : " + wrap.getValue());
	}

}
