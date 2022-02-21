package mypack;

public class Question2 implements Runnable {
	private Printer2 print;
	private boolean isEvenNumber;

	Question2(Printer2 print, int maxnum, boolean isEvenNumber) {
		this.print = print;
		this.isEvenNumber = true;
	}

	public static void main(String[] args) {
		Printer2 print = new Printer2();
		Thread t1 = new Thread(new Question2(print, 10, true), "Thread-1");
		Thread t2 = new Thread(new Question2(print, 10, true), "Thread-2");
		Thread t3 = new Thread(new Question2(print, 10, true), "Thread-3");
		Thread t4 = new Thread(new Question2(print, 10, true), "Thread-4");
		Thread t5 = new Thread(new Question2(print, 10, false), "Thread-5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	@Override
	public void run() {
		int number = isEvenNumber ? 2 : 1;
		print.printThread();

	}

}

class Printer2 {
	private int count = 0;

	synchronized void printThread() {
		count++;
		try {
			if (Thread.currentThread().getName().equals("Thread-5")) {
				wait();
			}

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Running : " + Thread.currentThread().getName() + " count:" + count);
		if (count >= 3) {
			notify();
		}

	}

}
