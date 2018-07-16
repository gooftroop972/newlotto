package com.stanleyfogo.tools.lottogui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class beeper extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	int counter = 0, x = 0;
	String s;
	
	
	public beeper() {
		setLayout(new FlowLayout());
		button = new JButton("CLICK FOR SOUND");
		add(button);
		
		label = new JLabel("");
		add(label);
		
		event e = new event();
		button.addActionListener(e);
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;
			if (x == 0) {
				s="Time";
			} if (x == 1) {
				s = "times";
			}
			label.setText("You have clicked "+counter+" "+s);
			x = 1;
			
		}
	}
	

}
