package com.example;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class DemoAwt7  extends Frame{

	public static void main(String[] args) {
		new DemoAwt7();
	}

	public DemoAwt7(){
		setVisible(true);
		setSize(600, 200);
		setLayout(new FlowLayout());
		
		TextField tf = new TextField("java");
		add(tf);
//		tf.setEditable(false);
//		System.out.println(tf.isEditable());
		
		tf.setText("Awt example");
		tf.setText("text is changed now");
		System.out.println(tf.getText());
	}
	
	
}
