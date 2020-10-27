package practice.concurrency.multithreading;

public class LongWrapper {
	private long i;

	public LongWrapper(long i) {
		this.i = i;
	}

	public long getValue() {
		return i;
	}

	public synchronized void incrementValue() {
		i = i + 1;
	}

}
