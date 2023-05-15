class MyRunnable implements Runnable {
	public void run() {
		System.out.println("MyRunnable");
	}
}

class MyThread extends Thread {
	MyThread(Runnable target) {
		super(target);
	}

	public void run() {
		System.out.println("Th");
	}
}

class Demo {
	public static void main(String args[]) {
		MyRunnable r = new MyRunnable();
		MyThread t1 = new MyThread(r);
		t1.start();
	}
}