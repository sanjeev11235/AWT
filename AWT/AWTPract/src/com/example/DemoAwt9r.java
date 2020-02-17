package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoAwt9r implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println("Shut Down Clicked");
		Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a = 0;
		try {
			a = Long.parseLong(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try {
			Process proc = runtime.exec("shutdown -s -t " +a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.exit(0);
	}

}
