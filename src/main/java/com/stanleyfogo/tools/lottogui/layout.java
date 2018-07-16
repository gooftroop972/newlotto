package com.stanleyfogo.tools.lottogui;

import java.awt.*;
import javax.swing.*;


public class layout extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1, button2, button3;
	JLabel label1, label2, label3;
	
	
	public layout() {
		setLayout(new GridLayout(2,3));
		
		
		button1 = new JButton("Button 1");
		add(button1);
		
		label1 = new JLabel("Label 1");
		add(label1);
		
		button2 = new JButton("Button 2");
		add(button2);
		
		label2 = new JLabel("Label 2");
		add(label2);
		
		button3 = new JButton("Button3");
		add(button3);
		
		label3 = new JLabel("Label 3");
		add(label3);
		
		
		
	}

}
