package com.stanleyfogo.tools.lottogui;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main (String args[]) {
		//cbTutorial gui = new cbTutorial();
		//table gui = new table();
		//random gui = new random();
		LottoGui gui = new LottoGui();
		//MenuTutorial gui = new MenuTutorial();
		//beeper gui = new beeper();
		//layout gui = new layout();
		//mousemover gui = new mousemover();
		//Calculator gui = new Calculator();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gui.setSize(850,300);
		gui.setSize(600,200);
		//gui.pack();
		gui.setVisible(true);
		gui.setTitle("Random Number Game");
	}
}
