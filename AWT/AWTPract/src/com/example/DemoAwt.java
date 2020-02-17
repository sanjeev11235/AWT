package com.example;

import java.awt.Frame;

public class DemoAwt {

	public static void main(String[] args) {
		System.out.println("1");
		Frame frame= new Frame();
		frame.setVisible(true);
		frame.setSize(600, 500);
		System.out.println(frame);
		System.out.println("2");
	}
}
