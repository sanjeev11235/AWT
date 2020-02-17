package com.example;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DemoAwt10 extends Frame implements ActionListener {

	Button b,c;

	public DemoAwt10() {
		setSize(600, 200);
		setVisible(true);
		setLayout(new FlowLayout());
		setLocation(100, 50);
		setBackground(java.awt.Color.blue);
		b = new Button("CLick");
		c = new Button("Another Button");
		b.addActionListener(this);
		c.addActionListener(this);
		b.setBackground(Color.red);
		add(b);
		add(c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Clicked DmeoAwt10");
//		System.out.println(e.getSource());
		Object source = e.getSource();
		if(source == b) {
			System.out.println("Click button is clicked");
		}
		if(source == c) {
			System.out.println("Another Button is clicked");
		}
	}

	public static void main(String[] args) {
		DemoAwt10 d = new DemoAwt10();
	}

}
