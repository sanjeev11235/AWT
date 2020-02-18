package com.example;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class DemoAwt11 extends Frame {

	Button b1;
	TextField email,pass;
	Label emailLabel,passLabel;
	
	public DemoAwt11(){
		setSize(600, 200);
		setVisible(true);
		setLayout(new FlowLayout());
		
		b1 = new Button("login");
		email = new TextField(20);
		pass =  new TextField(20);
		
		emailLabel = new Label("Enter email");
		passLabel = new Label("Enter password");
		
		add(emailLabel);
		add(email);
		add(passLabel);
		add(pass);
		add(b1);
	}

	public static void main(String[] args) {
		DemoAwt11 d= new DemoAwt11();
	}
}
