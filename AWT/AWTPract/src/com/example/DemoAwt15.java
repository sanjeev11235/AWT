package com.example;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DemoAwt15  extends Frame{

	public DemoAwt15() {

		setSize(600, 200);
		setLocation(200, 200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		DemoAwt15 w =new DemoAwt15();
		w.addWindowListener(new WindowListener() {
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				w.dispose();
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified");
			}

			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened");
			}
		});
	}

	
}
