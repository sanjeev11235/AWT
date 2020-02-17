package com.example;

import java.awt.Frame;
import java.awt.TextField;

public class DemoAwt4 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(600, 200);
		
		TextField tf =new TextField("this is example");
		TextField tf2 =new TextField("this is example 2");
		frame.add(tf);
		frame.add(tf2);
	}
}
