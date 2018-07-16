package com.stanleyfogo.tools.lottogui;

import java.awt.*;
import javax.swing.*;


public class table extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTable table;
	
	public table() {
		setLayout(new FlowLayout());
		
		String[] columnNames = {"Name", "Eye-Color", "Gender"};
		
		Object[][] data = {
				{"Bill","Hazel","Male"},
				{"Mary","Black","Female"},
				{"Rick","Red","Male"},
				{"Janice","Yellow","Female"},
		};
		
		table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		table.setFillsViewportHeight(true);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		
	}
	
	

}
