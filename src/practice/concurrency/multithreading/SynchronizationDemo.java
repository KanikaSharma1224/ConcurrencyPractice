package practice.concurrency.multithreading;

public class SynchronizationDemo {
	public static void main(String[] args) throws InterruptedException {
		Computable compute = new Computable();
		Thread t1 = new Thread(() -> {
			synchronized (compute) {
				System.out.println("Thread - name : " + Thread.currentThread().getName());
				compute.incrementCount();
			}
		});
		Thread t2 = new Thread(() -> {
			System.out.println("Thread - name : " + Thread.currentThread().getName());
			synchronized (compute) {
				compute.incrementCount();
			}
		});
		t1.start();
		//t1.join();

		t2.start();
		//t2.join();
		System.out.println(compute.getCount());

	}

}

class Computable {
	private int count;

	public synchronized void incrementCount() {
		count++;
	}

	public synchronized void decrmentCount() {
		count--;

	}

	public int getCount() {
		return count;
	}

}