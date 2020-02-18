package com.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class DemoAwt13 extends Frame {

	private Panel east;
	private Panel west;
	private Panel north;
	private Panel south;
	private Panel center;

	public DemoAwt13() {
		setSize(600, 200);
		setVisible(true);
		setLayout(new BorderLayout(10, 20));

		east = new Panel();
		west = new Panel();
		north = new Panel();
		south = new Panel();
		center = new Panel();

		east.setBackground(Color.blue);
		west.setBackground(Color.yellow);
		north.setBackground(Color.green);
		south.setBackground(Color.pink);
		center.setBackground(Color.red);

		east.setPreferredSize(new Dimension(50, 20));
		west.setPreferredSize(new Dimension(50, 20));
		north.setPreferredSize(new Dimension(100, 20));
		south.setPreferredSize(new Dimension(100, 20));

		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(center, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		DemoAwt13 d = new DemoAwt13();
	}

}
