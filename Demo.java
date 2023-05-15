import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
	private JButton exitButton;
	private JTextField text;

	MyFrame() {
		setSize(300, 300);
		setTitle("MyFrame");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		text = new JTextField(10);
		text.setFont(new Font("", 1, 30));
		add(text);

		exitButton = new JButton();
		exitButton.setText("Exit");
		exitButton.setFont(new Font("", 1, 30));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String name = text.getText();
				class MyThread extends Thread {
					public void run() {
						int i = 0;
						while (true) {
							System.out.println(name + " : " + i++);
						}
					}
				}
				new MyThread().start();

			}
		});
		add(exitButton);
	}
}

class Demo {
	public static void main(String args[]) {
		new MyFrame().setVisible(true);
	}
}