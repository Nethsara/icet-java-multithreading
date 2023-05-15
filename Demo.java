class MyThread extends Thread {
	MyThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " : " + i);
			// try {
			// Thread.sleep(100);
			// } catch (InterruptedException ex) {
			// }
		}
	}
}

class Demo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");

		System.out.println("State t1 : " + t1.getState());
		System.out.println("State t2 : " + t2.getState());
		System.out.println("State t3 : " + t3.getState());

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
		} catch (Exception e) {
		}

		System.out.println("State t1 : " + t1.getState());
		System.out.println("State t2 : " + t2.getState());
		System.out.println("State t3 : " + t3.getState());
	}
}
