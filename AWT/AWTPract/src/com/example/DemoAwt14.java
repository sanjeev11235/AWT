package com.example;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

public class DemoAwt14 extends Frame{

	public DemoAwt14() {

		setSize(600, 200);
		setLocation(200, 200);
		setVisible(true);
		setLayout(new GridLayout(2, 3, 10,15));
		
		add(new Button("Button 1"));
		add(new Button("Button 2"));
		add(new Button("Button 3"));
		add(new Button("Button 4"));
		add(new Button("Button 5"));
		add(new Button("Button 6"));
		
	}

	public static void main(String[] args) {
		DemoAwt14 d= new DemoAwt14();
	}
	
}
