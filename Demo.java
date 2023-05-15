class MyThread extends Thread {
	MyThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
		}
	}
}

class Demo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread("One");
		t1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			if (i == 50) {
				try {
					t1.join();
				} catch (InterruptedException ex) {
				}
			}
		}
	}
}