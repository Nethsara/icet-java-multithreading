class CustomerController {
	public void addCustomer(String id, String name) {
		System.out.print("[");
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print(id);
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print("-");
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print(name);
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.println("]");
	}

	static synchronized public void addOrder(String id, String name) {
		System.out.print("{");
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print(id);
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print("-");
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.print(name);
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		System.out.println("}");
	}
}

class Demo {
	public static void main(String args[]) {
		CustomerController c1 = new CustomerController();
		new Thread() {
			public void run() {
				//
				synchronized (CustomerController.class) {
					c1.addCustomer("C001", "Danapala");
				}
				//
			}
		}.start();
		new Thread() {
			public void run() {
				c1.addOrder("P001", "Suger");
			}
		}.start();
	}
}
