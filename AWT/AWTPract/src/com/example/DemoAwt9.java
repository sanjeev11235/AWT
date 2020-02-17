package com.example;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class DemoAwt9 extends Frame{

	Button b1,b2;
	public DemoAwt9() {

		setSize(600, 200);
		setVisible(true);
		setLayout(new FlowLayout());
		
		b1 = new Button("ShutDown");
		b2 = new Button("ClickHere");
		b1.addActionListener(new DemoAwt9r());
		
		add(b1);
		add(b2);
		
		
	}
	
	
	public static void main(String[] args) {
		DemoAwt9 d = new DemoAwt9();
	}

}
