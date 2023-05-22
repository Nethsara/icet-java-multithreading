class A {
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();
		A a2 = new A();
		new Thread() {
			public void run() {
				synchronized (a1) {
					// yield or sleep
					synchronized (a2) {
						//
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				synchronized (a2) {
					// yield or sleep
					synchronized (a1) {
						//
					}
				}
			}
		}.start();
	}
}
