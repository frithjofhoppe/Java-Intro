package chapter19.lambda.demo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Lambda Expression Demo.
 */
public class ActionListenerDemo {

	public static void main(String[] args) {

		// Anonyme Klasse die das Interface ActionListener implementiert.
		// Das Interface hat die Methode: void actionPerformed(ActionEvent
		// event);
		// Die actionPerfomed Methode hat einen Parameter und gibt keinen Wert
		// zurück.
		JButton btn1 = new JButton("Button 1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Click detected by anonymous class.");
			}
		});

		// Lambda Ausdruck anstelle der anonymen Klasse.
		// Der Ausdruck hat einen Parameter und gibt keinen Wert zurück.
		JButton btn2 = new JButton("Button 2");
		btn2.addActionListener(e -> System.out.println("Click detected by lambda listner."));

		//
		// show frame
		//
		JFrame frame = new JFrame("Listener Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

}
