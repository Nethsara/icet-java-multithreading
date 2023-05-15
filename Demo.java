class MyThread extends Thread {
	MyThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
}

class Demo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");

		t1.start();
		t2.start();
		t3.start();
	}
}