package com.example;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment2 extends Frame implements ActionListener {

	private TextField t1, t2, t3;
	private Button b1, b2, b3, b4, b5;

	public Assignment2() throws HeadlessException {
		setSize(600, 300);
		setVisible(true);
		setLocation(100, 100);
		setLayout(new GridLayout(3, 3, 10, 10));

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();

		b1 = new Button("+");
		b1.setSize(100, 50);
		b2 = new Button("-");
		b2.setSize(100, 50);
		b3 = new Button("*");
		b3.setSize(100, 50);
		b4 = new Button("/");
		b4.setSize(100, 50);
		b5 = new Button("reset");
		b5.setSize(100, 50);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

	}

	public static void main(String[] args) {
		Assignment2 a = new Assignment2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			System.out.println(t1.getText() + " here " + t2.getText());
			if (t1.getText().toString().equals("") & t2.getText().toString().equals("")) {
				t1.setBackground(Color.red);
				t2.setBackground(Color.red);
				System.out.println("Addition");
			} else {
				if (!t1.getText().equals(" ") & !t2.getText().equals(" ")) {
					System.out.println("else of b1");
					t1.setBackground(Color.white);
					t2.setBackground(Color.white);
					t3.setText(String
							.valueOf(Integer.parseInt(t1.getText().trim()) + Integer.parseInt(t2.getText().trim())));

				}
			}
		}

		if (e.getSource() == b2) {
			if (t1.getText().toString().equals("") & t2.getText().toString().equals("")) {
				t1.setBackground(Color.red);
				t2.setBackground(Color.red);
				System.out.println("Substraction");

			} else {
				if (!t1.getText().equals(" ") & !t2.getText().equals(" ")) {
					System.out.println("else of b2");
					t1.setBackground(Color.white);
					t2.setBackground(Color.white);
					t3.setText(String
							.valueOf(Integer.parseInt(t1.getText().trim()) - Integer.parseInt(t2.getText().trim())));

				}
			}
		}
		if (e.getSource() == b3) {
			if (t1.getText().toString().equals("") & t2.getText().toString().equals("")) {
				t1.setBackground(Color.red);
				t2.setBackground(Color.red);
				System.out.println("Multiplication");
			} else {
				if (!t1.getText().equals(" ") & !t2.getText().equals(" ")) {
					System.out.println("else of b3");
					t1.setBackground(Color.white);
					t2.setBackground(Color.white);
					t3.setText(String
							.valueOf(Integer.parseInt(t1.getText().trim()) * Integer.parseInt(t2.getText().trim())));
				}
			}
		}
		if (e.getSource() == b4) {
			if (t1.getText().toString().equals("") & t2.getText().toString().equals("")) {
				t1.setBackground(Color.red);
				t2.setBackground(Color.red);
				System.out.println("Division");
			} else {
				if (!t1.getText().equals(" ") & !t2.getText().equals(" ")) {
					System.out.println("else of b4");
					t1.setBackground(Color.white);
					t2.setBackground(Color.white);
					t3.setText(String
							.valueOf(Integer.parseInt(t1.getText().trim()) / Integer.parseInt(t2.getText().trim())));
				}
			}
		}
		if (e.getSource() == b5) {
			try {
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t1.setBackground(Color.white);
				t2.setBackground(Color.white);
				System.out.println("Reset All");
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
