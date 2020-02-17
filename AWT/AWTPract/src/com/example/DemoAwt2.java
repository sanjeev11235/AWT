package com.example;

import java.awt.Frame;
import java.awt.HeadlessException;

public class DemoAwt2 extends Frame {

	public static void main(String[] args) {
		System.out.println("start");
//		DemoAwt2 d= new DemoAwt2("My Frame");
		DemoAwt2 d= new DemoAwt2();
		System.out.println(d);
		d.setSize(300, 100);
		d.setVisible(true);
		d.setTitle("Frame1");
		System.out.println("end");
	}

//	public DemoAwt2(String title) throws HeadlessException {
//		super(title);
//	}
	
	
}
