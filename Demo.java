class Bucket {
	synchronized public void get(int i) {
		notify();
		System.out.println("get : " + i);
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void put(int i) {
		notify();
		System.out.println("put : " + i);
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Demo {
	public static void main(String args[]) {
		Bucket b1 = new Bucket();
		new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					b1.get(i);
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					b1.put(i);
				}
			}
		}.start();
	}
}