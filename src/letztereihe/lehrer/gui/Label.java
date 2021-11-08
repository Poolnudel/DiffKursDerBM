package letztereihe.lehrer.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Label extends JLabel {
	/**
	 * @param x starting position x axis
	 * @param y starting position y axis
	 * @param weidth weidth of the label 
	 * @param height height of the label
	 */
	public Label(int x, int y, int weidth, int height) {
		super();
		setBounds(x, y, weidth, height);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		setFont(font);
		setForeground(Color.white);
	}
}
