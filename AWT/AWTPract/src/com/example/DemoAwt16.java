package com.example;

import java.awt.Frame;
import java.awt.HeadlessException;

public class DemoAwt16 extends Frame {

	public DemoAwt16() {
		setSize(600, 200);
		setLocation(200, 200);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		DemoAwt16 d= new DemoAwt16();
		d.addWindowListener(new DemoAwt16r());
	}
}
