package com.example;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment1 extends Frame implements ActionListener {

	private TextField tf;
	private TextField tf2;
	private Button swap;

	public Assignment1() {

		setTitle("Assignment1");
		setVisible(true);
		setSize(600, 200);
		setLocation(50, 50);
		setLayout(new FlowLayout());

		tf = new TextField(10);
		tf2 = new TextField(10);

		swap = new Button("Swap");
		swap.addActionListener(this);
		add(tf);
		add(tf2);
		add(swap);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("swap values:");
		
		String t1 = tf.getText();
		String t2 = tf2.getText();
		
		tf.setText(t2);
		tf2.setText(t1);
	}

	public static void main(String[] args) {
		Assignment1 a = new Assignment1();
	}
}
