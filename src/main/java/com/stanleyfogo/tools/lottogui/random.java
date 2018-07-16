package com.stanleyfogo.tools.lottogui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class random extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	
	public random() {
		panel = new JPanel();
		panel.setBackground(randomColor());
		add(panel);
		
		event e = new event();
		panel.addMouseListener(e);
		
	}
	
	public Color randomColor() {
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		return(new Color(r,g,b));
	}
	
	public class event implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			panel.setBackground(randomColor());
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
	}

}
