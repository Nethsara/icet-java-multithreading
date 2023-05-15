class MyThread extends Thread {
	public void run() {
		Thread t = currentThread();
		System.out.println("Name : " + t.getName());
	}
}

class Demo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		t1.setName("My Thread");
		t1.start(); // vs t1.run();
	}
}