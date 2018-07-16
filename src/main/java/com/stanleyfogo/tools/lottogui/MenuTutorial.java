package com.stanleyfogo.tools.lottogui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class MenuTutorial extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar menubar;
	JMenu file;
	JMenuItem exit;
	
	
	public MenuTutorial() {
		setLayout(new FlowLayout());
		
		menubar = new JMenuBar() ;
		setJMenuBar(menubar);
		
		file = new JMenu("File");
		menubar.add(file);
		
		exit = new JMenuItem("Exit");
		file.add(exit);
		
		event e = new event();
		exit.addActionListener(e);
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	

}
