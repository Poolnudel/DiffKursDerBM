package letztereihe.lehrer.gui;

import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextField extends JTextField {
	/**
	 * @param x starting position x axis
	 * @param y starting position y axis
	 * @param weidth weidth of the TextField 
	 * @param height height of the TextField
	 */

	public TextField(int x, int y, int weidth, int height) {
		super();
		setBounds(x, y, weidth, height);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		setFont(font);

	}
}
